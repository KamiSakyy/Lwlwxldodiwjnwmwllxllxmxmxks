package a5;

import android.view.View;

/* loaded from: /home/user/work/p/classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f510a;

    /* renamed from: b, reason: collision with root package name */
    public int f511b;

    /* renamed from: c, reason: collision with root package name */
    public int f512c;

    public /* synthetic */ y(int i) {
        this.f510a = i;
    }

    public void a(l7.n1 n1Var) {
        View view = n1Var.f28209a;
        this.f511b = view.getLeft();
        this.f512c = view.getTop();
        view.getRight();
        view.getBottom();
    }

    public String toString() {
        switch (this.f510a) {
            case 1:
                StringBuilder sb2 = new StringBuilder("Location(line = ");
                sb2.append(this.f511b);
                sb2.append(", column = ");
                return x.i.j(sb2, this.f512c, ')');
            default:
                return super.toString();
        }
    }

    public /* synthetic */ y(int i, int i10, int i11) {
        this.f510a = i11;
        this.f511b = i;
        this.f512c = i10;
    }
}
