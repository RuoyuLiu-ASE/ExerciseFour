package Exercise7.Task2;

/**
 * @author: Alan
 * @create: 2019-12-04 20:21
 * @function:
 * @version:
 * @important value:
 */
public class BluRayMovie extends VideoStoreItem {
    private boolean readable;
    private int regionCode;

    public boolean isReadable() {
        return readable;
    }

    public void setReadable(boolean readable) {
        this.readable = readable;
    }

    public int getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(int regionCode) {
        this.regionCode = regionCode;
    }
}
