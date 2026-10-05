package b91;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* loaded from: /home/user/work/p/classes5.dex */
public final class i implements l {
    @Override // b91.l
    public final boolean a(SSLSocket sSLSocket) {
        return k.b && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // b91.l
    public final n b(SSLSocket sSLSocket) {
        return new k();
    }
}
