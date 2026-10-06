package h11;

import android.content.Context;
import android.content.SharedPreferences;
import com.github.testingsettings.TestingSettingsFragment;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import sy.y;
import w61.a0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i extends c71.j implements j71.c {
    public final /* synthetic */ int v;
    public final /* synthetic */ TestingSettingsFragment w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(TestingSettingsFragment testingSettingsFragment, a71.c cVar, int i) {
        super(1, cVar);
        this.v = i;
        this.w = testingSettingsFragment;
    }

    @Override // j71.c
    public final Object k(Object obj) {
        a71.c cVar = (a71.c) obj;
        switch (this.v) {
            case 0:
                i iVar = new i(this.w, cVar, 0);
                a0 a0Var = a0.a;
                iVar.v(a0Var);
                return a0Var;
            default:
                i iVar2 = new i(this.w, cVar, 1);
                a0 a0Var2 = a0.a;
                iVar2.v(a0Var2);
                return a0Var2;
        }
    }

    @Override // c71.a
    public final Object v(Object obj) {
        int i = this.v;
        a0 a0Var = a0.a;
        TestingSettingsFragment testingSettingsFragment = this.w;
        switch (i) {
            case 0:
                b71.a aVar = b71.a.r;
                y.j(obj);
                testingSettingsFragment.v4().b(ei.g.v, false);
                break;
            default:
                b71.a aVar2 = b71.a.r;
                y.j(obj);
                fi.c cVar = fi.d.Companion;
                Context i4 = testingSettingsFragment.i4();
                cVar.getClass();
                long epochMilli = ZonedDateTime.now(ZoneOffset.UTC).toInstant().toEpochMilli();
                SharedPreferences.Editor edit = fi.c.b(i4).edit();
                edit.putLong("notifications_banner_last_shown", epochMilli);
                edit.apply();
                SharedPreferences.Editor edit2 = fi.c.b(i4).edit();
                edit2.putInt("app_launch_countdown_between_banners", 5);
                edit2.apply();
                SharedPreferences.Editor edit3 = fi.c.b(i4).edit();
                edit3.putBoolean("swipe_onboarding_notification_settings_shown", true);
                edit3.apply();
                fi.c.a(testingSettingsFragment.i4());
                testingSettingsFragment.v4().b(ei.g.x, false);
                break;
        }
        return a0Var;
    }
    public Object F() { return null; }
}
