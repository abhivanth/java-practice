import java.util.Objects;

public class Block {
    String message;
    long proofOfWork;
    int previousHashCode;
    int hashCode;

    public Block(String msg, long proof ,int previousHash) {
        this.message = msg;
        this.proofOfWork = proof;
        this.previousHashCode = previousHash;
        this.hashCode = hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Block block = (Block) o;
        return proofOfWork == block.proofOfWork &&
                previousHashCode == block.previousHashCode &&
                hashCode == block.hashCode &&
                Objects.equals(message, block.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, proofOfWork, previousHashCode);
    }


    public String toString() {
        return "['"+message+"' | "+proofOfWork+" | "+previousHashCode+"]";
    }

    public static void main(String[] args) {
        Block b1 = new Block("Goodbye", -1, 1);
        Block b3 = new Block("Goodbye", -1, b1.getStoredHashCode());
    }

    public int getStoredHashCode() {
        return hashCode;
    }


}
