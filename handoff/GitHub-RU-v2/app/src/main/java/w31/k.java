package w31;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.github.commonandroid.featureflag.RuntimeFeatureFlag;
import com.github.rudroid.commit.CommitActivity;
import com.github.rudroid.commit.CommitDataContainer;
import com.github.rudroid.commit.CommitDetailsFragment;
import le.b;
import le.c;
import le.f;
import sy.s;
import wf.h;
import xa.p;

/* loaded from: /home/user/work/p/classes4.dex */
public final /* synthetic */ class k implements View.OnClickListener {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    public /* synthetic */ k(int i, Object obj, Object obj2) {
        this.r = i;
        this.s = obj;
        this.t = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.r;
        Object obj = this.t;
        Object obj2 = this.s;
        switch (i) {
            case 0:
                l lVar = (l) obj2;
                lVar.getClass();
                ((View.OnClickListener) obj).onClick(view);
                lVar.b(1);
                break;
            case 1:
                uc.b bVar = (uc.b) obj2;
                wc.d dVar = (wc.d) obj;
                int i2 = wc.d.y;
                boolean z = bVar.s;
                dVar.v.N1(bVar, !z);
                com.github.rudroid.utilities.b bVar2 = (com.github.rudroid.utilities.b) dVar.x.getValue();
                String string = ((com.github.rudroid.adapters.viewholders.e) dVar).u.A.getContext().getString(!z ? 2131953737 : 2131954108);
                k71.k.f(string, "getString(...)");
                bVar2.b(string);
                break;
            case 2:
                ((wc.e) obj2).v.w0(((f.d) obj).c);
                break;
            case 3:
                ((wc.g) obj2).v.U(((f.e) obj).c);
                break;
            case 4:
                ((wf.i) obj2).v.m0(((h.b) obj).b);
                break;
            case 5:
                ((wf.l) obj2).v.m0(((wf.k) obj).a);
                break;
            case 6:
                ((xa.c) obj2).d.Z2(((c.a) obj).c.x);
                break;
            case 7:
                CommitDetailsFragment commitDetailsFragment = ((xa.c) obj2).e;
                String str = ((c.b) obj).c.a;
                commitDetailsFragment.getClass();
                RuntimeFeatureFlag runtimeFeatureFlag = RuntimeFeatureFlag.a;
                ei.c cVar = ei.c.w;
                runtimeFeatureFlag.getClass();
                if (!RuntimeFeatureFlag.a(cVar) || !com.github.rudroid.main.navigation.f.b(commitDetailsFragment)) {
                    CommitActivity.a aVar = CommitActivity.Companion;
                    Context i4 = commitDetailsFragment.i4();
                    aVar.getClass();
                    commitDetailsFragment.E(CommitActivity.a.a(i4, str), (Bundle) null);
                    break;
                } else {
                    nb.b.a(s.i(commitDetailsFragment), new CommitDataContainer.CommitFromId(str));
                    break;
                }
                break;
            case 8:
                ((p) obj2).d.T0((b.f) obj);
                break;
            default:
                ((p) obj2).d.T0((b.g) obj);
                break;
        }
    }

    public /* synthetic */ k(p pVar, int i, le.b bVar, int i2) {
        this.r = i2;
        this.s = pVar;
        this.t = bVar;
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class p<T1,T2,T3,T4> {
        public p() {
        }
    }
}
