package com.github.rudroid.widget.shortcuts;

import android.view.KeyEvent;
import com.github.rudroid.widget.shortcuts.ShortcutWidgetSettingsActivity;

/* loaded from: /home/user/work/p/classes3.dex */
final class i0 implements j71.c {
    public final /* synthetic */ float r;
    public final /* synthetic */ ShortcutWidgetSettingsActivity s;

    public i0(float f, ShortcutWidgetSettingsActivity shortcutWidgetSettingsActivity) {
        this.r = f;
        this.s = shortcutWidgetSettingsActivity;
    }

    public final Object k(Object obj) {
        KeyEvent keyEvent = ((o2.b) obj).a;
        k71.k.g(keyEvent, "$v$c$androidx-compose-ui-input-key-KeyEvent$-it$0");
        if (o2.c.c(keyEvent) == 2) {
            long a = o2.c.a(keyEvent.getKeyCode());
            boolean a2 = o2.a.a(a, o2.a.g);
            ShortcutWidgetSettingsActivity shortcutWidgetSettingsActivity = this.s;
            float f = this.r;
            if (a2) {
                if (f >= 1.0f) {
                    return Boolean.FALSE;
                }
                ShortcutWidgetSettingsActivity.a aVar = ShortcutWidgetSettingsActivity.Companion;
                shortcutWidgetSettingsActivity.s0().Q(f + 0.1f);
                return Boolean.TRUE;
            }
            if (o2.a.a(a, o2.a.f)) {
                if (f <= 0.0f) {
                    return Boolean.FALSE;
                }
                ShortcutWidgetSettingsActivity.a aVar2 = ShortcutWidgetSettingsActivity.Companion;
                shortcutWidgetSettingsActivity.s0().Q(f - 0.1f);
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
}
