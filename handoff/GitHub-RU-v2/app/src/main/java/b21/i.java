package b21;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i implements Runnable {
    public final /* synthetic */ int r;
    public final int s;
    public final Object t;

    public /* synthetic */ i(Object obj, int i, int i2) {
        this.r = i2;
        this.t = obj;
        this.s = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.r) {
            case 0:
                ((j) this.t).i(this.s);
                break;
            case 1:
                ((MaterialCalendar) this.t).A0.o0(this.s);
                break;
            case 2:
                ((RecyclerView) this.t).o0(this.s);
                break;
            default:
                q4.b bVar = (q4.b) ((kk.a) this.t).s;
                if (bVar != null) {
                    bVar.i(this.s);
                    break;
                }
                break;
        }
    }

    public i(int i, j8.m mVar) {
        this.r = 2;
        this.s = i;
        this.t = mVar;
    }
    public Object a() { return null; }
    public Object d() { return null; }
}
