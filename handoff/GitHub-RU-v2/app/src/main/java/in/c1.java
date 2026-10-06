package in;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.InputStream;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c1 extends q81.y {
    public ContentResolver a;
    public q81.q b;
    public long c;
    public Uri d;

    public c1(ContentResolver contentResolver, q81.q qVar, long j, Uri uri) {
        k71.k.g(uri, "uri");
        this.a = contentResolver;
        this.b = qVar;
        this.c = j;
        this.d = uri;
    }

    public final long a() {
        return this.c;
    }

    public final q81.q b() {
        return this.b;
    }

    public final void d(h91.i iVar) {
        InputStream openInputStream = this.a.openInputStream(this.d);
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
