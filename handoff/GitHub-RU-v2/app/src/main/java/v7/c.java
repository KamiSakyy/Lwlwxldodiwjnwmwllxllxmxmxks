package v7;

/* loaded from: /home/user/work/p/classes.dex */
public interface c extends AutoCloseable {
    boolean B0();

    default boolean R() {
        return getLong(0) != 0;
    }

    void c(int i, long j10);

    void d(int i, byte[] bArr);

    void g(int i);

    byte[] getBlob(int i);

    int getColumnCount();

    String getColumnName(int i);

    long getLong(int i);

    boolean isNull(int i);

    void k0(String str, int i);

    void l();

    String l0(int i);

    void reset();
    public Object v(Object) { return null; }
}
