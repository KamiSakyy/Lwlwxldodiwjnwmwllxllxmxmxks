package h11;

import android.view.LayoutInflater;
import com.github.developersettings.DeveloperSettingsActivity;
import com.github.testingsettings.TestingSettingsActivity;
import k.z;
import l7.x1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a implements g.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ k.i b;

    public /* synthetic */ a(k.i iVar, int i) {
        this.a = i;
        this.b = iVar;
    }

    public final void a(d.j jVar) {
        switch (this.a) {
            case 0:
                TestingSettingsActivity testingSettingsActivity = (TestingSettingsActivity) this.b;
                if (!testingSettingsActivity.W) {
                    testingSettingsActivity.W = true;
                    ((d) testingSettingsActivity.w()).getClass();
                    break;
                }
                break;
            case 1:
                DeveloperSettingsActivity developerSettingsActivity = this.b;
                if (!developerSettingsActivity.W) {
                    developerSettingsActivity.W = true;
                    ((ii.b) developerSettingsActivity.w()).getClass();
                    break;
                }
                break;
            default:
                k.i iVar = this.b;
                LayoutInflater.Factory2 F = iVar.F();
                LayoutInflater.Factory2 factory2 = (z) F;
                LayoutInflater from = LayoutInflater.from(((z) factory2).B);
                if (from.getFactory() == null) {
                    from.setFactory2(factory2);
                } else {
                    from.getFactory2();
                }
                ((x1) ((d.j) iVar).u.s).p("androidx:appcompat");
                F.f();
                break;
        }
    }
}
