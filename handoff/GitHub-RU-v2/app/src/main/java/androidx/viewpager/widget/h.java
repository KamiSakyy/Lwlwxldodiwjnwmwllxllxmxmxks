package androidx.viewpager.widget;

import android.database.DataSetObserver;
import com.google.android.material.tabs.TabLayout;
import q.t2;
import q.y1;

/* loaded from: /home/user/work/p/classes.dex */
public final class h extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3165a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3166b;

    public /* synthetic */ h(int i, Object obj) {
        this.f3165a = i;
        this.f3166b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        switch (this.f3165a) {
            case k5.f.J:
                ((k) this.f3166b).e();
                break;
            case 1:
                t2 t2Var = (t2) this.f3166b;
                t2Var.f24769r = true;
                t2Var.notifyDataSetChanged();
                break;
            case 2:
                y1 y1Var = (y1) this.f3166b;
                if (y1Var.Q.isShowing()) {
                    y1Var.g();
                    break;
                }
                break;
            default:
                ((TabLayout) this.f3166b).i();
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        switch (this.f3165a) {
            case k5.f.J:
                ((k) this.f3166b).e();
                break;
            case 1:
                t2 t2Var = (t2) this.f3166b;
                t2Var.f24769r = false;
                t2Var.notifyDataSetInvalidated();
                break;
            case 2:
                ((y1) this.f3166b).dismiss();
                break;
            default:
                ((TabLayout) this.f3166b).i();
                break;
        }
    }
}
