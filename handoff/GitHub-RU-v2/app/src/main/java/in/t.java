package in;

import android.content.ContentResolver;
import android.net.Uri;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t {
    public final Uri a;
    public final String b;
    public final long c;
    public final String d;
    public final ContentResolver e;

    public t(Uri uri, String str, long j, String str2, ContentResolver contentResolver) {
        k71.k.g(uri, "uri");
        this.a = uri;
        this.b = str;
        this.c = j;
        this.d = str2;
        this.e = contentResolver;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return k71.k.b(this.a, tVar.a) && k71.k.b(this.b, tVar.b) && this.c == tVar.c && k71.k.b(this.d, tVar.d) && k71.k.b(this.e, tVar.e);
    }

    public final int hashCode() {
        int c = x.i.c(h1.i(this.a.hashCode() * 31, this.b, 31), 31, this.c);
        String str = this.d;
        return this.e.hashCode() + ((c + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "FileData(uri=" + this.a + ", name=" + this.b + ", size=" + this.c + ", mimeType=" + this.d + ", contentResolver=" + this.e + ")";
    }
}
