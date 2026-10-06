package com.github.rudroid.pushnotifications.decryption;

import android.util.Base64;
import sy.w;

/* loaded from: /home/user/work/p/classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public String f18551a;

    /* renamed from: b, reason: collision with root package name */
    public String f18552b;

    /* renamed from: c, reason: collision with root package name */
    public w61.p f18553c;

    /* renamed from: d, reason: collision with root package name */
    public w61.p f18554d;

    /* renamed from: e, reason: collision with root package name */
    public w61.p f18555e;

    public d(String str, String str2) {
        this.f18551a = str;
        this.f18552b = str2;
        final int i = 0;
        this.f18553c = w.t(new j71.a(this) { // from class: com.github.rudroid.pushnotifications.decryption.c

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ d f18550s;

            {
                this.f18550s = this;
            }

            public final Object a() {
                int i10 = i;
                d dVar = this.f18550s;
                switch (i10) {
                    case k5.f.J /* 0 */:
                        return Base64.decode(dVar.f18551a, 0);
                    case 1:
                        return Base64.decode(dVar.f18552b, 0);
                    default:
                        return x61.l.V(x61.l.V(new byte[]{Byte.MIN_VALUE}, dVar.b()), dVar.a());
                }
            }
        });
        final int i10 = 1;
        this.f18554d = w.t(new j71.a(this) { // from class: com.github.rudroid.pushnotifications.decryption.c

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ d f18550s;

            {
                this.f18550s = this;
            }

            public final Object a() {
                int i102 = i10;
                d dVar = this.f18550s;
                switch (i102) {
                    case k5.f.J /* 0 */:
                        return Base64.decode(dVar.f18551a, 0);
                    case 1:
                        return Base64.decode(dVar.f18552b, 0);
                    default:
                        return x61.l.V(x61.l.V(new byte[]{Byte.MIN_VALUE}, dVar.b()), dVar.a());
                }
            }
        });
        final int i11 = 2;
        this.f18555e = w.t(new j71.a(this) { // from class: com.github.rudroid.pushnotifications.decryption.c

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ d f18550s;

            {
                this.f18550s = this;
            }

            public final Object a() {
                int i102 = i11;
                d dVar = this.f18550s;
                switch (i102) {
                    case k5.f.J /* 0 */:
                        return Base64.decode(dVar.f18551a, 0);
                    case 1:
                        return Base64.decode(dVar.f18552b, 0);
                    default:
                        return x61.l.V(x61.l.V(new byte[]{Byte.MIN_VALUE}, dVar.b()), dVar.a());
                }
            }
        });
    }

    public final byte[] a() {
        Object value = this.f18553c.getValue();
        k71.k.f(value, "getValue(...)");
        return (byte[]) value;
    }

    public final byte[] b() {
        Object value = this.f18554d.getValue();
        k71.k.f(value, "getValue(...)");
        return (byte[]) value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return k71.k.b(this.f18551a, dVar.f18551a) && k71.k.b(this.f18552b, dVar.f18552b);
    }

    public final int hashCode() {
        return this.f18552b.hashCode() + (this.f18551a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("CipherAndIV(base64CipherText=", this.f18551a, ", base64IV=", this.f18552b, ")");
    }
}
