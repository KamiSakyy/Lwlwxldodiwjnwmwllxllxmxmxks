package com.github.rudroid.pushnotifications.decryption;

import android.util.Base64;
import java.util.ArrayList;
import java.util.Collection;
import javax.crypto.spec.SecretKeySpec;
import x61.v;

/* loaded from: /home/user/work/p/classes.dex */
public final class s {
    public static final a Companion = new a();

    /* renamed from: h, reason: collision with root package name */
    public static final s f18578h;

    /* renamed from: a, reason: collision with root package name */
    public SecretKeySpec f18579a;

    /* renamed from: b, reason: collision with root package name */
    public SecretKeySpec f18580b;

    /* renamed from: c, reason: collision with root package name */
    public String f18581c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f18582d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f18583e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f18584f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f18585g;

    public static final class a {
    }

    static {
        ArrayList arrayList;
        q71.g gVar = new q71.g(0, 31, 1);
        ArrayList arrayList2 = new ArrayList(x61.n.F(gVar, 10));
        v it = gVar.iterator();
        while (((q71.f) it).f31001t) {
            arrayList2.add(Byte.valueOf((byte) it.nextInt()));
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(x61.m.A0(arrayList2), "AES");
        q71.g gVar2 = new q71.g(1, 32, 1);
        ArrayList arrayList3 = new ArrayList(x61.n.F(gVar2, 10));
        v it2 = gVar2.iterator();
        while (((q71.f) it2).f31001t) {
            arrayList3.add(Byte.valueOf((byte) it2.nextInt()));
        }
        SecretKeySpec secretKeySpec2 = new SecretKeySpec(x61.m.A0(arrayList3), "HMACSHA256");
        byte[] decode = Base64.decode("DqymegXicLrNj3/wm73e+9Oi6zv/49aMHfuwKirkf6o=", 0);
        k71.k.f(decode, "decode(...)");
        byte[] decode2 = Base64.decode("2eIWkHPuSnR+kvR7xo/Gfw==", 0);
        k71.k.f(decode2, "decode(...)");
        byte[] decode3 = Base64.decode("2ZDxzwSxK6iw4jBMW9NJPxMs3RCWY3oMbg/AKMI6K4I=", 0);
        k71.k.f(decode3, "decode(...)");
        f18578h = new s(secretKeySpec, secretKeySpec2, decode, decode2, decode3);
        l71.a cVar = new q71.c('a', 'z');
        q71.c cVar2 = new q71.c('A', 'Z');
        if (cVar instanceof Collection) {
            arrayList = x61.m.l0((Collection) cVar, cVar2);
        } else {
            ArrayList arrayList4 = new ArrayList();
            x61.m.J(arrayList4, cVar);
            x61.m.J(arrayList4, cVar2);
            arrayList = arrayList4;
        }
        x61.m.l0(arrayList, new q71.c('0', '9'));
    }

    public s(SecretKeySpec secretKeySpec, SecretKeySpec secretKeySpec2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] V = x61.l.V(x61.l.V(new byte[]{Byte.MIN_VALUE}, bArr2), bArr);
        k71.k.f(Base64.encodeToString(x61.l.V(x61.l.V(x61.l.V(new byte[]{Byte.MIN_VALUE}, bArr2), bArr), bArr3), 2), "encodeToString(...)");
        this.f18579a = secretKeySpec;
        this.f18580b = secretKeySpec2;
        this.f18581c = "This is a test message";
        this.f18582d = bArr;
        this.f18583e = bArr2;
        this.f18584f = bArr3;
        this.f18585g = V;
    }
}
