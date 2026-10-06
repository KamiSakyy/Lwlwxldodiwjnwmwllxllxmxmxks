package ek;

import com.github.service.models.response.shortcuts.ShortcutColor;
import com.github.service.models.response.shortcuts.ShortcutIcon;
import com.github.service.models.response.shortcuts.ShortcutType;
import fk.g;
import java.util.List;
import k71.k;
import l7.x1;
import u31.f;
import v8.l0;
import w61.p;

/* loaded from: /home/user/work/p/classes3.dex */
public class b extends l0 {
    public final /* synthetic */ d a;

    public b(d dVar) {
        this.a = dVar;
    }

    public final void l(v7.c cVar, Object obj) {
        e eVar = (e) obj;
        k.g(cVar, "statement");
        k.g(eVar, "entity");
        String str = eVar.a;
        cVar.k0(str, 1);
        cVar.k0(eVar.b, 2);
        cVar.k0(eVar.c, 3);
        d dVar = this.a;
        x1 x1Var = dVar.c;
        List list = eVar.d;
        ((g) ((p) x1Var.s).getValue()).getClass();
        cVar.k0(g.a(list), 4);
        rb0.b bVar = dVar.d;
        com.github.service.models.response.shortcuts.a aVar = eVar.e;
        bVar.getClass();
        k.g(aVar, "shortcutType");
        l81.b bVar2 = l81.c.d;
        bVar2.getClass();
        cVar.k0(bVar2.b(com.github.service.models.response.shortcuts.a.Companion.serializer(), aVar), 5);
        f fVar = dVar.e;
        ShortcutType shortcutType = eVar.f;
        fVar.getClass();
        k.g(shortcutType, "shortcutType");
        cVar.k0(shortcutType.getValue(), 6);
        m90.c cVar2 = dVar.f;
        ShortcutColor shortcutColor = eVar.g;
        cVar2.getClass();
        k.g(shortcutColor, "shortcutColor");
        cVar.k0(shortcutColor.getValue(), 7);
        n51.e eVar2 = dVar.g;
        ShortcutIcon shortcutIcon = eVar.h;
        eVar2.getClass();
        k.g(shortcutIcon, "shortcutIcon");
        cVar.k0(shortcutIcon.getValue(), 8);
        cVar.k0(str, 9);
    }

    public final String n() {
        return "UPDATE OR ABORT `shortcuts` SET `id` = ?,`name` = ?,`full_query_string` = ?,`query` = ?,`scope` = ?,`type` = ?,`color` = ?,`icon` = ? WHERE `id` = ?";
    }
}
