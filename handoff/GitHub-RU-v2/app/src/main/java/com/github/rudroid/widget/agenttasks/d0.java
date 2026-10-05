package com.github.rudroid.widget.agenttasks;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class d0 extends com.github.rudroid.widget.f {
    public boolean j0;

    @Override // com.github.rudroid.widget.e
    public final void Z() {
        if (this.j0) {
            return;
        }
        this.j0 = true;
        ((u) w()).i0((AgentTasksWidgetSettingsActivity) this);
    }
}
