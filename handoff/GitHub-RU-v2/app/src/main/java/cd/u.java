package cd;

import android.view.View;
import com.github.rudroid.actions.checklog.u0;
import com.github.rudroid.actions.checklog.w0;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class u implements View.OnLongClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4234a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4235b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.github.rudroid.adapters.viewholders.e f4236c;

    public /* synthetic */ u(com.github.rudroid.adapters.viewholders.e eVar, int i, int i10) {
        this.f4234a = i10;
        this.f4236c = eVar;
        this.f4235b = i;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.f4234a) {
            case k5.f.J:
                com.github.rudroid.interfaces.e eVar = ((v) this.f4236c).f4237v;
                if (eVar != null) {
                    eVar.F0(this.f4235b);
                    break;
                }
                break;
            case 1:
                com.github.rudroid.interfaces.e eVar2 = ((u0) this.f4236c).f4887v;
                if (eVar2 != null) {
                    eVar2.F0(this.f4235b);
                    break;
                }
                break;
            default:
                com.github.rudroid.interfaces.e eVar3 = ((w0) this.f4236c).f4896v;
                if (eVar3 != null) {
                    eVar3.F0(this.f4235b);
                    break;
                }
                break;
        }
        return true;
    }
}
