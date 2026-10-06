package q;

/* loaded from: /home/user/work/p/classes.dex */
public final class v1Shadow implements Runnable {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f30742r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ y1 f30743s;

    public /* synthetic */ v1(y1 y1Var, int i) {
        this.f30742r = i;
        this.f30743s = y1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f30742r) {
            case k5.f.J:
                o1 o1Var = this.f30743s.f30765t;
                if (o1Var != null) {
                    o1Var.setListSelectionHidden(true);
                    o1Var.requestLayout();
                    break;
                }
                break;
            default:
                y1 y1Var = this.f30743s;
                o1 o1Var2 = y1Var.f30765t;
                if (o1Var2 != null && o1Var2.isAttachedToWindow() && y1Var.f30765t.getCount() > y1Var.f30765t.getChildCount() && y1Var.f30765t.getChildCount() <= y1Var.D) {
                    y1Var.Q.setInputMethodMode(2);
                    y1Var.g();
                    break;
                }
                break;
        }
    }
}
