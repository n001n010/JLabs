package L1.MainPackage;

interface MainInterface {
    String knowMyself();
    String getInformation();
}

interface DebugOutputStream extends MainInterface
{
    @Override
    String toString();
}