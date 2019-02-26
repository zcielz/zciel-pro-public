package cn.zciel.chapter08;


/**
 * @author YINZHEN
 * @date 2019/2/25 19:31
 * @Description 假设room对象必须在回收前清理干净
 */
public class Room implements AutoCloseable {
    @Override
    public void close() throws Exception {

    }

    //TODO 代码有问题
    /*private static final Cleaner cleaner = Cleaner.create();

    private final State state;

    private final Cleaner.Cleanable cleanable;

    private static class State implements Runnable {

        int numJunkPiles;

        State(int numJunkPiles) {
            this.numJunkPiles = numJunkPiles;
        }

        @Override
        public void run() {
            System.out.println("Cleaning ronm");
            numJunkPiles = 0;
        }

    }

    @Override
    public void close() throws Exception {
        cleanable.clean();
    }

    public Room(int numJunkPiles) {
        state = new State(numJunkPiles);
        cleanable = cleaner.register(this, state);
    }*/


}
