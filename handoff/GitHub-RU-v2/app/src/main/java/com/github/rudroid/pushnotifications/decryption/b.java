package com.github.rudroid.pushnotifications.decryption;

/* loaded from: /home/user/work/p/classes.dex */
public final class b {
    public static final a Companion = new a();

    /* renamed from: a, reason: collision with root package name */
    public String f18547a;

    /* renamed from: b, reason: collision with root package name */
    public String f18548b;

    public static final class a {
    }

    public b(String str, String str2) {
        k71.k.g(str, "macAlias");
        k71.k.g(str2, "encryptionAlias");
        this.f18547a = str;
        this.f18548b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k71.k.b(this.f18547a, bVar.f18547a) && k71.k.b(this.f18548b, bVar.f18548b);
    }

    public final int hashCode() {
        return this.f18548b.hashCode() + (this.f18547a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("AliasPair(macAlias=", this.f18547a, ", encryptionAlias=", this.f18548b, ")");
    }
}
