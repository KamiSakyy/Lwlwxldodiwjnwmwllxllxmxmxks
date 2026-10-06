package xn;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b4 implements c4 {
    public String a;

    public b4(String str) {
        k71.k.g(str, "message");
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b4) && k71.k.b(this.a, ((b4) obj).a);
    }

    @Override // xn.c4
    public final String getType() {
        return "user_message";
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("UserMessage(message=", this.a, ")");
    }
}
