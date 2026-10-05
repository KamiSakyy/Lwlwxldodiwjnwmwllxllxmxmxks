package jg;

import com.github.rudroid.shortcuts.activities.ShortcutsOverviewFragment;
import ic.jg;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j extends f {
    public final a v;

    public interface a {
        void t(wm.b bVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(jg jgVar, ShortcutsOverviewFragment shortcutsOverviewFragment) {
        super(jgVar);
        k.g(shortcutsOverviewFragment, "callback");
        this.v = shortcutsOverviewFragment;
    }
}
