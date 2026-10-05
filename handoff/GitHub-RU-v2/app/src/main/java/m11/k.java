package m11;

import java.io.Closeable;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k implements Closeable {
    public v61.a r;
    public n11.d s;
    public v61.a t;
    public t11.e u;
    public v61.a v;
    public v61.a w;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((t11.i) ((t11.d) this.v.get())).close();
    }
}
