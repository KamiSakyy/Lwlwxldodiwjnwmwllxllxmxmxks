package o;

import a5.l1;
import a5.m1;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes.dex */
public final class k {

    /* renamed from: c, reason: collision with root package name */
    public Interpolator f29777c;

    /* renamed from: d, reason: collision with root package name */
    public m1 f29778d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f29779e;

    /* renamed from: b, reason: collision with root package name */
    public long f29776b = -1;

    /* renamed from: f, reason: collision with root package name */
    public final j f29780f = new j(this);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f29775a = new ArrayList();

    public final void a() {
        if (this.f29779e) {
            ArrayList arrayList = this.f29775a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((l1) obj).b();
            }
            this.f29779e = false;
        }
    }

    public final void b() {
        View view;
        if (this.f29779e) {
            return;
        }
        ArrayList arrayList = this.f29775a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            l1 l1Var = (l1) obj;
            long j10 = this.f29776b;
            if (j10 >= 0) {
                l1Var.c(j10);
            }
            Interpolator interpolator = this.f29777c;
            if (interpolator != null && (view = (View) l1Var.f439a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f29778d != null) {
                l1Var.d(this.f29780f);
            }
            View view2 = (View) l1Var.f439a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f29779e = true;
    }
}
