package androidx.compose.runtime;

/* loaded from: /home/user/work/p/classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public int f1566a;

    public b(int i) {
        this.f1566a = i;
    }

    public final boolean a() {
        return this.f1566a != Integer.MIN_VALUE;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("{ location = ");
        return a0.s0.l(sb2, this.f1566a, " }");
    }
}
