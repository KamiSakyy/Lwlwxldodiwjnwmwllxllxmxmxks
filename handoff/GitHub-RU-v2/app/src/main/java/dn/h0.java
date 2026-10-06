package dn;

import android.os.Build;
import android.provider.Settings;
import android.security.keystore.KeyInfo;
import android.util.Base64;
import com.github.domain.twofactor.keystore.TwoFactorException;
import com.github.rudroid.common.e;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.cert.Certificate;
import java.util.UUID;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h0 {
    public final en.c a;
    public final oa.g b;
    public final k0 c;
    public final qe.a d;

    public h0(en.c cVar, oa.g gVar, k0 k0Var, qe.a aVar) {
        k71.k.g(cVar, "factory");
        k71.k.g(gVar, "service");
        k71.k.g(k0Var, "deviceInfoProvider");
        this.a = cVar;
        this.b = gVar;
        this.c = k0Var;
        this.d = aVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|(1:(1:(4:11|12|13|14)(2:16|17))(5:18|19|20|21|22))(10:34|35|36|37|38|39|(1:41)|42|43|(3:45|(1:47)(1:86)|(9:49|(1:51)(1:83)|(6:56|57|(1:59)|60|(1:62)(1:76)|(4:64|(1:73)(1:68)|69|(2:71|24)(2:72|22))(2:74|75))|77|78|79|80|13|14)(2:84|85))(2:87|88))))|92|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x017f, code lost:
    
        if (r6.b(r0, r4) != r5) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x003a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oa.j jVar, c71.c cVar) {
        f0 f0Var;
        int i;
        String str;
        en.b bVar;
        int i2;
        KeyInfo keyInfo;
        oa.j jVar2 = jVar;
        k0 k0Var = this.c;
        if (cVar instanceof f0) {
            f0Var = (f0) cVar;
            int i3 = f0Var.z;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                f0Var.z = i3 - Integer.MIN_VALUE;
                Object obj = f0Var.x;
                b71.a aVar = b71.a.r;
                i = f0Var.z;
                en.c cVar2 = this.a;
                a71.c cVar3 = null;
                if (i != 0) {
                    sy.y.j(obj);
                    cVar2.getClass();
                    en.b b = en.c.b(jVar2);
                    try {
                        en.b.b().deleteEntry(b.b);
                    } catch (Exception unused) {
                    }
                    jVar2.h(-1L);
                    KeyStore b2 = en.b.b();
                    String str2 = b.b;
                    if (!b2.containsAlias(str2)) {
                        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
                        keyPairGenerator.initialize(en.b.a(str2));
                        keyPairGenerator.generateKeyPair();
                    }
                    Certificate certificate = b2.getCertificate(str2);
                    if (certificate == null) {
                        throw new TwoFactorException("no cert found");
                    }
                    String F = y9.a.F(certificate);
                    String uuid = UUID.randomUUID().toString();
                    k71.k.f(uuid, "toString(...)");
                    byte[] bytes = uuid.getBytes(en.b.c);
                    k71.k.f(bytes, "getBytes(...)");
                    Key key = en.b.b().getKey(b.b, null);
                    PrivateKey privateKey = key instanceof PrivateKey ? (PrivateKey) key : null;
                    if (privateKey == null) {
                        throw new TwoFactorException("no cert found");
                    }
                    Signature signature = Signature.getInstance("SHA256withECDSA");
                    signature.initSign(privateKey);
                    signature.update(bytes);
                    byte[] sign = signature.sign();
                    if (sign != null) {
                        str = Base64.encodeToString(sign, 2);
                        k71.k.f(str, "encodeToString(...)");
                    } else {
                        str = null;
                    }
                    if (str != null && str.length() != 0) {
                        e11.a aVar2 = (e11.a) this.b.a(jVar2);
                        e11.b bVar2 = new e11.b(str, uuid);
                        String string = Settings.Global.getString(k0Var.a.getContentResolver(), "device_name");
                        if (string == null) {
                            string = Build.MODEL;
                            k71.k.f(string, "MODEL");
                        }
                        k71.k.f(Build.MODEL, "MODEL");
                        Key key2 = en.b.b().getKey(b.b, null);
                        PrivateKey privateKey2 = key2 instanceof PrivateKey ? (PrivateKey) key2 : null;
                        if (privateKey2 == null) {
                            throw new TwoFactorException("no cert found");
                        }
                        KeyFactory keyFactory = KeyFactory.getInstance(privateKey2.getAlgorithm(), "AndroidKeyStore");
                        boolean b3 = k71.k.b((keyFactory == null || (keyInfo = (KeyInfo) keyFactory.getKeySpec(privateKey2, KeyInfo.class)) == null) ? null : Boolean.valueOf(keyInfo.isInsideSecureHardware()), Boolean.TRUE);
                        f0Var.u = jVar2;
                        f0Var.v = b;
                        f0Var.w = 0;
                        f0Var.z = 1;
                        Object b4 = aVar2.b(F, bVar2, string, b3);
                        if (b4 == aVar) {
                            return aVar;
                        }
                        bVar = b;
                        obj = b4;
                        i2 = 0;
                        y71.y yVar = new y71.y((y71.i) obj, new g0(bVar, jVar2, cVar3, 0));
                        d0 d0Var = new d0(jVar2, 1);
                        f0Var.u = jVar2;
                        f0Var.v = null;
                        f0Var.w = i2;
                        f0Var.z = 2;
                    }
                    try {
                        en.b.b().deleteEntry(b.b);
                    } catch (Exception unused2) {
                    }
                    jVar2.h(-1L);
                    return w61.a0.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oa.j jVar3 = f0Var.u;
                    sy.y.j(obj);
                    return w61.a0.a;
                }
                int i4 = f0Var.w;
                en.b bVar3 = f0Var.v;
                oa.j jVar4 = f0Var.u;
                try {
                    sy.y.j(obj);
                    i2 = i4;
                    jVar2 = jVar4;
                    bVar = bVar3;
                    y71.y yVar2 = new y71.y((y71.i) obj, new g0(bVar, jVar2, cVar3, 0));
                    d0 d0Var2 = new d0(jVar2, 1);
                    f0Var.u = jVar2;
                    f0Var.v = null;
                    f0Var.w = i2;
                    f0Var.z = 2;
                } catch (Exception e) {
                    e = e;
                    jVar2 = jVar4;
                    e.toString();
                    cVar2.getClass();
                    try {
                        en.b.b().deleteEntry(en.c.b(jVar2).b);
                    } catch (Exception unused3) {
                    }
                    jVar2.h(-1L);
                    e.a aVar3 = com.github.rudroid.common.e.Companion;
                    this.d.b("RegisterRecoveryCertificateUseCase", e, true);
                    return w61.a0.a;
                }
            }
        }
        f0Var = new f0(this, cVar);
        Object obj2 = f0Var.x;
        b71.a aVar4 = b71.a.r;
        i = f0Var.z;
        en.c cVar22 = this.a;
        a71.c cVar32 = null;
        if (i != 0) {
        }
    }
}
