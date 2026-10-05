package g91;

import h91.l;
import h91.t;
import java.io.Closeable;
import java.util.zip.Deflater;

/* loaded from: /home/user/work/p/classes5.dex */
public final class a implements Closeable {
    public final /* synthetic */ int r;
    public final boolean s;
    public final h91.h t;
    public Object u;
    public Closeable v;

    public a(boolean z, int i) {
        this.r = i;
        switch (i) {
            case 1:
                this.s = z;
                this.t = new h91.h();
                break;
            default:
                this.s = z;
                h91.h hVar = new h91.h();
                this.t = hVar;
                Deflater deflater = new Deflater(-1, true);
                this.u = deflater;
                this.v = new l(hVar, deflater);
                break;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.r) {
            case 0:
                ((l) this.v).close();
                break;
            default:
                t tVar = (t) this.v;
                if (tVar != null) {
                    tVar.close();
                }
                this.v = null;
                this.u = null;
                break;
        }
    }
}
