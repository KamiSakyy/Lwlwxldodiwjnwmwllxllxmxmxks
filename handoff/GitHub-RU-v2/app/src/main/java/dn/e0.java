package dn;

import android.os.Build;
import android.provider.Settings;
import android.security.keystore.KeyInfo;
import android.util.Base64;
import com.github.domain.twofactor.RegisterAuthCertLocalException;
import com.github.domain.twofactor.keystore.TwoFactorException;
import com.github.rudroid.common.e;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.util.UUID;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e0 {
    public en.c a;
    public oa.g b;
    public k0 c;
    public qe.a d;

    public e0(en.c cVar, oa.g gVar, k0 k0Var, qe.a aVar) {
        k71.k.g(cVar, "factory");
        k71.k.g(gVar, "service");
        k71.k.g(k0Var, "deviceInfoProvider");
        this.a = cVar;
        this.b = gVar;
        this.c = k0Var;
        this.d = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x018d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x018e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oa.j jVar, c71.c cVar) {
        b0 b0Var;
        int i;
        qe.a aVar;
        w61.a0 a0Var;
        en.c cVar2;
        w61.a0 a0Var2;
        String str;
        en.b bVar;
        int i2;
        KeyInfo keyInfo;
        oa.j jVar2 = jVar;
        k0 k0Var = this.c;
        try {
            try {
                if (cVar instanceof b0) {
                    b0Var = (b0) cVar;
                    int i3 = b0Var.z;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        b0Var.z = i3 - Integer.MIN_VALUE;
                        Object obj = b0Var.x;
                        b71.a aVar2 = b71.a.r;
                        i = b0Var.z;
                        aVar = this.d;
                        en.c cVar3 = this.a;
                        a0Var = w61.a0.a;
                        if (i != 0) {
                            sy.y.j(obj);
                            cVar3.getClass();
                            en.b b = en.c.b(jVar2);
                            String str2 = b.a;
                            b.c();
                            jVar2.i(-1L);
                            KeyStore b2 = en.b.b();
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
                            cVar2 = cVar3;
                            try {
                                k71.k.f(bytes, "getBytes(...)");
                                byte[] d = b.d(bytes);
                                if (d != null) {
                                    a0Var2 = a0Var;
                                    str = Base64.encodeToString(d, 2);
                                    k71.k.f(str, "encodeToString(...)");
                                } else {
                                    a0Var2 = a0Var;
                                    str = null;
                                }
                                if (str != null && str.length() != 0) {
                                    if (!b.e(uuid, d)) {
                                        b.c();
                                        jVar2.i(-1L);
                                        RegisterAuthCertLocalException registerAuthCertLocalException = new RegisterAuthCertLocalException("unable to verify signature locally");
                                        e.a aVar3 = com.github.rudroid.common.e.Companion;
                                        aVar.b("RegisterAuthCertificateUseCase", registerAuthCertLocalException, true);
                                        return a0Var2;
                                    }
                                    e11.a aVar4 = (e11.a) this.b.a(jVar2);
                                    e11.b bVar2 = new e11.b(str, uuid);
                                    String string = Settings.Global.getString(k0Var.a.getContentResolver(), "device_name");
                                    if (string == null) {
                                        string = Build.MODEL;
                                        k71.k.f(string, "MODEL");
                                    }
                                    k71.k.f(Build.MODEL, "MODEL");
                                    Key key = en.b.b().getKey(str2, null);
                                    PrivateKey privateKey = key instanceof PrivateKey ? (PrivateKey) key : null;
                                    if (privateKey == null) {
                                        throw new TwoFactorException("no cert found");
                                    }
                                    KeyFactory keyFactory = KeyFactory.getInstance(privateKey.getAlgorithm(), "AndroidKeyStore");
                                    boolean b3 = k71.k.b((keyFactory == null || (keyInfo = (KeyInfo) keyFactory.getKeySpec(privateKey, KeyInfo.class)) == null) ? null : Boolean.valueOf(keyInfo.isInsideSecureHardware()), Boolean.TRUE);
                                    b0Var.u = jVar2;
                                    b0Var.v = b;
                                    b0Var.w = 0;
                                    b0Var.z = 1;
                                    Object c = aVar4.c(F, bVar2, string, b3);
                                    if (c != aVar2) {
                                        bVar = b;
                                        obj = c;
                                        i2 = 0;
                                    }
                                }
                                b.c();
                                jVar2.i(-1L);
                                RegisterAuthCertLocalException registerAuthCertLocalException2 = new RegisterAuthCertLocalException("adding auth public key failed, signature null or empty");
                                e.a aVar5 = com.github.rudroid.common.e.Companion;
                                aVar.b("RegisterAuthCertificateUseCase", registerAuthCertLocalException2, true);
                                return a0Var2;
                            } catch (Exception e) {
                                e = e;
                                e.toString();
                                cVar2.getClass();
                                en.c.b(jVar2).c();
                                jVar2.i(-1L);
                                e.a aVar6 = com.github.rudroid.common.e.Companion;
                                aVar.b("RegisterAuthCertificateUseCase", e, true);
                                return a0Var;
                            }
                        }
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            oa.j jVar3 = b0Var.u;
                            sy.y.j(obj);
                            return a0Var;
                        }
                        int i4 = b0Var.w;
                        en.b bVar3 = b0Var.v;
                        oa.j jVar4 = b0Var.u;
                        try {
                            sy.y.j(obj);
                            i2 = i4;
                            jVar2 = jVar4;
                            bVar = bVar3;
                            a0Var2 = a0Var;
                        } catch (Exception e2) {
                            e = e2;
                            jVar2 = jVar4;
                            cVar2 = cVar3;
                            e.toString();
                            cVar2.getClass();
                            en.c.b(jVar2).c();
                            jVar2.i(-1L);
                            e.a aVar62 = com.github.rudroid.common.e.Companion;
                            aVar.b("RegisterAuthCertificateUseCase", e, true);
                            return a0Var;
                        }
                        y71.y yVar = new y71.y((y71.i) obj, new c0(bVar, jVar2, this, null));
                        d0 d0Var = new d0(jVar2, 0);
                        b0Var.u = jVar2;
                        b0Var.v = null;
                        b0Var.w = i2;
                        b0Var.z = 2;
                        return yVar.b(d0Var, b0Var) != aVar2 ? aVar2 : a0Var2;
                    }
                }
                if (i != 0) {
                }
                y71.y yVar2 = new y71.y((y71.i) obj, new c0(bVar, jVar2, this, null));
                d0 d0Var2 = new d0(jVar2, 0);
                b0Var.u = jVar2;
                b0Var.v = null;
                b0Var.w = i2;
                b0Var.z = 2;
                if (yVar2.b(d0Var2, b0Var) != aVar2) {
                }
            } catch (Exception e3) {
                e = e3;
            }
        } catch (Exception e4) {
            e = e4;
            e.toString();
            cVar2.getClass();
            en.c.b(jVar2).c();
            jVar2.i(-1L);
            e.a aVar622 = com.github.rudroid.common.e.Companion;
            aVar.b("RegisterAuthCertificateUseCase", e, true);
            return a0Var;
        }
        b0Var = new b0(this, cVar);
        Object obj2 = b0Var.x;
        b71.a aVar22 = b71.a.r;
        i = b0Var.z;
        aVar = this.d;
        en.c cVar32 = this.a;
        a0Var = w61.a0.a;
    }
}
