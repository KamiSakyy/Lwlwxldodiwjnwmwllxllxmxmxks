package d31;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import l7.n1;
import l7.s0;
import l7.u;
import l7.x;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a implements Runnable {
    public final /* synthetic */ int r;
    public final /* synthetic */ int s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;

    public /* synthetic */ a(Object obj, Object obj2, int i, int i2) {
        this.r = i2;
        this.u = obj;
        this.t = obj2;
        this.s = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.r) {
            case 0:
                ((BottomSheetBehavior) this.u).L((View) this.t, this.s, false);
                break;
            case 1:
                u uVar = (u) this.t;
                n1 n1Var = uVar.e;
                x xVar = (x) this.u;
                RecyclerView recyclerView = xVar.r;
                if (recyclerView != null && recyclerView.J && !uVar.k && n1Var.h() != -1) {
                    s0 itemAnimator = xVar.r.getItemAnimator();
                    if (itemAnimator == null || !itemAnimator.f()) {
                        ArrayList arrayList = xVar.p;
                        int size = arrayList.size();
                        for (int i = 0; i < size; i++) {
                            if (((u) arrayList.get(i)).l) {
                            }
                        }
                        xVar.m.j(n1Var, this.s);
                        break;
                    }
                    xVar.r.post(this);
                    break;
                }
                break;
            default:
                ((TextView) this.t).setTypeface((Typeface) this.u, this.s);
                break;
        }
    }

    public a(TextView textView, Typeface typeface, int i) {
        this.r = 2;
        this.t = textView;
        this.u = typeface;
        this.s = i;
    }
    public Object c() { return null; }
    public Object c = null;
}
