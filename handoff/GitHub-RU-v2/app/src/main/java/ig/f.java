package ig;

import com.github.domain.shortcuts.model.ShortcutConfigurationModel;
import com.github.rudroid.shortcuts.navigation.ConfigureShortcutRoute;
import com.github.service.models.response.shortcuts.ShortcutType;
import java.util.List;
import k71.k;
import x6.a0;
import x6.d0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f {
    public static final void a(a0 a0Var, List list, com.github.service.models.response.shortcuts.a aVar, ShortcutType shortcutType) {
        k.g(a0Var, "<this>");
        k.g(list, "filters");
        k.g(aVar, "shortcutScope");
        k.g(shortcutType, "shortcutType");
        com.github.rudroid.shortcuts.e.Companion.getClass();
        ShortcutConfigurationModel shortcutConfigurationModel = com.github.rudroid.shortcuts.e.F;
        com.github.rudroid.main.navigation.f.c(a0Var, new ConfigureShortcutRoute(new ShortcutConfigurationModel(list, shortcutConfigurationModel.t, shortcutConfigurationModel.u, aVar, shortcutType, shortcutConfigurationModel.x), false, true, true, false), (d0) null, 6);
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class a0<T1,T2,T3,T4> {
        public a0() {
        }
    }
}
