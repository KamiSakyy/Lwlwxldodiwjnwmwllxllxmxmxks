package da1;

/* loaded from: /home/user/work/p/classes5.dex */
public enum q1 extends l3 {
    public q1() {
        super("CharacterReferenceInData", 1);
    }

    @Override // da1.l3
    public final void d(u0 u0Var, a aVar) {
        int[] c = u0Var.c(null, false);
        if (c == null) {
            u0Var.f('&');
        } else {
            u0Var.h(new String(c, 0, c.length));
        }
        u0Var.o(l3.r);
    }
}
