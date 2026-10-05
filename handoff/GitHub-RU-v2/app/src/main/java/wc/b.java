package wc;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import y31.i;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class b implements View.OnTouchListener {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f33482r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f33483s;

    public /* synthetic */ b(int i, Object obj) {
        this.f33482r = i;
        this.f33483s = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = this.f33482r;
        Object obj = this.f33483s;
        switch (i) {
            case k5.f.J:
                d dVar = (d) obj;
                int i10 = d.f33486y;
                if (motionEvent.getActionMasked() == 0) {
                    dVar.f33487v.H0(dVar);
                    break;
                }
                break;
            case 1:
                g gVar = (g) obj;
                int i11 = g.f33494y;
                if (motionEvent.getActionMasked() == 0) {
                    gVar.f33496w.H0(gVar);
                    break;
                }
                break;
            default:
                i iVar = (i) obj;
                if (motionEvent.getAction() == 1) {
                    long uptimeMillis = SystemClock.uptimeMillis() - iVar.o;
                    if (uptimeMillis < 0 || uptimeMillis > 300) {
                        iVar.m = false;
                    }
                    iVar.t();
                    iVar.m = true;
                    iVar.o = SystemClock.uptimeMillis();
                    break;
                }
                break;
        }
        return false;
    }
}
