package com.github.rudroid.settings.copilot.paywall;

import com.github.rudroid.activities.p2;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class o extends p2 {
    public boolean s0;

    public final void Z() {
        if (this.s0) {
            return;
        }
        this.s0 = true;
        ((k) w()).E((CopilotChatProPaywallActivity) this);
    }
    public Object onCreate(Object p1) { return null; }
    public Object onPause() { return null; }
    public Object onResume() { return null; }
}
