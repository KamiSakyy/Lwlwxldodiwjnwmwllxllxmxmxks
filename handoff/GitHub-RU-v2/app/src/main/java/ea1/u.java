package ea1;

/* loaded from: /home/user/work/p/classes5.dex */
public final class u extends y {
    static {
        ThreadLocal.withInitial(new ba1.b(0));
    }

    @Override // ea1.n
    public final int a() {
        return this.a.a() * 10;
    }

    public final String toString() {
        return String.format(":has(%s)", this.a);
    }
}
