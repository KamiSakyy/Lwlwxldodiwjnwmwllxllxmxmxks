package in;

import android.content.ContentResolver;
import android.net.Uri;
import com.google.android.gms.internal.measurement.i4;
import java.io.InputStream;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u0 extends q81.y {
    public ContentResolver a;
    public Uri b;

    public u0(ContentResolver contentResolver, Uri uri) {
        k71.k.g(contentResolver, "contentResolver");
        k71.k.g(uri, "uri");
        this.a = contentResolver;
        this.b = uri;
    }

    public final q81.q b() {
        t71.n nVar = q81.q.d;
        return i4.g0("application/binary");
    }

    public final void d(h91.i iVar) {
        InputStream openInputStream = this.a.openInputStream(this.b);
        if (openInputStream == null) {
            return;
        }
        h91.u g = h91.b.g(openInputStream);
        try {
            iVar.G(g);
            g.close();
        } finally {
        }
    }
}
