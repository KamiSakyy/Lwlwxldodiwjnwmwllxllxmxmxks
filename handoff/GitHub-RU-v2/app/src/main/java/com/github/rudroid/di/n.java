package com.github.rudroid.di;

import android.app.Application;
import java.util.Set;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class n implements j71.a {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f10978r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Application f10979s;

    public /* synthetic */ n(Application application, int i) {
        this.f10978r = i;
        this.f10979s = application;
    }

    public final Object a() {
        int i = this.f10978r;
        Application application = this.f10979s;
        switch (i) {
            case k5.f.J /* 0 */:
                Set set = o.f10980a;
                return k21.f.z(application, "copilot_home_tooltips");
            case 1:
                Set set2 = o.f10980a;
                return k21.f.z(application, "code_options");
            case 2:
                Set set3 = o.f10980a;
                return k21.f.z(application, "preference_missed_two_factor");
            case 3:
                Set set4 = o.f10980a;
                return k21.f.z(application, "create_new_issue_tooltips");
            case 4:
                Set set5 = o.f10980a;
                return k21.f.z(application, "system_preferences");
            case 5:
                Set set6 = o.f10980a;
                return k21.f.z(application, "preference_name_widget_shortcut");
            case 6:
                Set set7 = o.f10980a;
                return k21.f.z(application, "preference_name_widget_agent_tasks");
            default:
                Set set8 = o.f10980a;
                return k21.f.z(application, "app_lock");
        }
    }
}
