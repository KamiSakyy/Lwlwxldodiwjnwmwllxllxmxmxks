package com.github.rudroid.settings.copilot;

import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.github.rudroid.activities.m0;

@c71.e(c = "com.github.rudroid.settings.copilot.CopilotChatSettingsActivity$onCreate$1$1$1$1", f = "CopilotChatSettingsActivity.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class g extends c71.j implements j71.e {
    public final /* synthetic */ CopilotChatSettingsActivity v;
    public final /* synthetic */ String w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(CopilotChatSettingsActivity copilotChatSettingsActivity, String str, a71.c cVar) {
        super(2, cVar);
        this.v = copilotChatSettingsActivity;
        this.w = str;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new g(this.v, this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        g r = r((a71.c) obj2, (v71.z) obj);
        w61.a0 a0Var = w61.a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        com.github.rudroid.activities.m0.q0(this.v, this.w, (m0.b) null, (ViewGroup) null, (ComposeView) null, 62);
        return w61.a0.a;
    }



}
