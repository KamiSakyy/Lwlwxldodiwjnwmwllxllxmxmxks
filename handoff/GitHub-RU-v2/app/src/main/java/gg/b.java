package gg;

import android.view.View;
import androidx.fragment.app.s;
import f0.b2;
import ic.fh;
import k5.f;
import k71.k;
import k71.m;
import k71.x;
import l7.n1;
import r71.e;
import sy.w;
import w61.p;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b extends n1 {
    public static final /* synthetic */ e[] y;
    public final fh u;
    public final a v;
    public final p w;
    public final b5.e x;

    public interface a {
        void a(int i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(fh fhVar, a aVar) {
        super(r0);
        k.g(aVar, "callback");
        View view = ((f) fhVar).A;
        this.u = fhVar;
        this.v = aVar;
        final int i = 0;
        view.setOnClickListener(new View.OnClickListener(this) { // from class: gg.a
            public final /* synthetic */ b s;

            {
                this.s = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        b bVar = this.s;
                        fh fhVar2 = bVar.u;
                        fhVar2.N.setChecked(!r1.isChecked());
                        ((f) fhVar2).A.postDelayed(new s(17, bVar), 200L);
                        break;
                    default:
                        ((f) this.s.u).A.callOnClick();
                        break;
                }
            }
        });
        final int i2 = 1;
        fhVar.N.setOnClickListener(new View.OnClickListener(this) { // from class: gg.a
            public final /* synthetic */ b s;

            {
                this.s = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i2) {
                    case 0:
                        b bVar = this.s;
                        fh fhVar2 = bVar.u;
                        fhVar2.N.setChecked(!r1.isChecked());
                        ((f) fhVar2).A.postDelayed(new s(17, bVar), 200L);
                        break;
                    default:
                        ((f) this.s.u).A.callOnClick();
                        break;
                }
            }
        });
        this.w = w.t(new b2(10, this));
        this.x = new b5.e();
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class fh<T1,T2,T3,T4> {
        public fh() {
        }
    }
}
