package n81;

import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Base64;
import com.github.rudroid.copilot.h1;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: /home/user/work/p/classes5.dex */
public final class a {
    public String a;
    public HashSet b;
    public String c;
    public Boolean d;

    public a(PackageInfo packageInfo, boolean z) {
        String str = packageInfo.packageName;
        Signature[] signatureArr = packageInfo.signatures;
        HashSet hashSet = new HashSet();
        for (Signature signature : signatureArr) {
            try {
                hashSet.add(Base64.encodeToString(MessageDigest.getInstance("SHA-512").digest(signature.toByteArray()), 10));
            } catch (NoSuchAlgorithmException unused) {
                throw new IllegalStateException("Platform does not supportSHA-512 hashing");
            }
        }
        String str2 = packageInfo.versionName;
        this.a = str;
        this.b = hashSet;
        this.c = str2;
        this.d = Boolean.valueOf(z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a.equals(aVar.a) && this.c.equals(aVar.c) && this.d == aVar.d && this.b.equals(aVar.b);
    }

    public final int hashCode() {
        int i = (this.d.booleanValue() ? 1 : 0) + h1.i(this.a.hashCode() * 92821, this.c, 92821);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            i = (i * 92821) + ((String) it.next()).hashCode();
        }
        return i;
    }
}
