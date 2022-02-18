//import static ProofOfWork.proofOfWork;
//import static ProofOfWork.verify;

public class BlockChain {

    static int REQUIRED_LENGTH = 10;
    List<Block> blockchain = new SingleLinkedList<>();

    final static int START_BLOCK_HASH = (new Block("", 0, 0)).hashCode();


    public BlockChain() {
        assert false;
        blockchain.addItem(new Block("0",0,START_BLOCK_HASH));
    }

    public BlockChain(int lengthOfProof) {
        this();
        REQUIRED_LENGTH = lengthOfProof;
    }


    public void addBlock(String message) {
        blockchain.addItem(new Block(message,ProofOfWork.proofOfWork(REQUIRED_LENGTH),START_BLOCK_HASH));

    }

    public boolean verify() {
        // or: int currentHash = ("['"+curBlock.message+"' | "+curBlock.proofOfWork+" | "+previousHash+"]").hashCode();
        int previousHash = START_BLOCK_HASH;
        for (int i = 1; i < blockchain.length(); i++) {
            Block curBlock = blockchain.getItem(i);
            int currentHash = curBlock.hashCode();
            if(!ProofOfWork.verify(curBlock.proofOfWork,10) || !(currentHash == curBlock.hashCode)){
                return false;
            }
            // if you encounter any inconsistency, you may immediately call 'return false;' to exit early
        }
        return true;
    }


    public static void main(String[] args) {
        BlockChain bc = new BlockChain(REQUIRED_LENGTH);
        System.out.println(bc.blockchain);
        System.out.println("bc.blockchain.length() = " + bc.blockchain.length()); // should be 1, because of the start block

        bc.addBlock("Message 1!");
        bc.addBlock("Message 2!!");
        bc.addBlock("Message 3!!!");
        System.out.println(bc.blockchain);  // should print 4 blocks (empty start block + the three above)
        System.out.println(bc.verify());    // should print "true"
    }
}
