package n51;

import android.content.Context;
import androidx.compose.ui.layout.o0;
import b21.v;
import bm.k;
import com.github.domain.searchandfilter.filters.data.RepositoryOwnerRepositoriesFilter;
import com.github.service.models.response.shortcuts.ShortcutIcon;
import com.google.android.gms.internal.measurement.b7;
import com.google.android.gms.internal.measurement.j8;
import com.google.android.gms.internal.measurement.l8;
import com.google.android.gms.internal.measurement.t7;
import com.google.android.gms.internal.measurement.z6;
import com.google.android.gms.measurement.internal.c0;
import com.google.android.gms.measurement.internal.x;
import java.util.Iterator;
import java.util.List;
import x61.r;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e implements w7.b, k, x, k21.b {
    public static final /* synthetic */ e s = new e(3);
    public static final /* synthetic */ e t = new e(4);
    public static final /* synthetic */ e u = new e(5);
    public final /* synthetic */ int r;

    public /* synthetic */ e(int i) {
        this.r = i;
    }

    public static ShortcutIcon e(String str) {
        Object obj;
        k71.k.g(str, "value");
        ShortcutIcon.Companion.getClass();
        Iterator<E> it = ShortcutIcon.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (k71.k.b(((ShortcutIcon) obj).getValue(), str)) {
                break;
            }
        }
        ShortcutIcon shortcutIcon = (ShortcutIcon) obj;
        return shortcutIcon == null ? ShortcutIcon.ZAP : shortcutIcon;
    }

    @Override // k21.b
    public int a(Context context, String str, boolean z) {
        return k21.e.d(context, str, z);
    }

    @Override // k21.b
    public int b(Context context, String str) {
        return k21.e.a(context, str);
    }

    @Override // com.google.android.gms.measurement.internal.x
    public Object c() {
        switch (this.r) {
            case 3:
                List list = c0.a;
                z6.s.get();
                Long l = (Long) b7.A.b();
                l.getClass();
                return l;
            case 4:
                List list2 = c0.a;
                j8.s.get();
                return (String) l8.f.b();
            default:
                List list3 = c0.a;
                Boolean bool = (Boolean) t7.b.b();
                bool.getClass();
                return bool;
        }
    }

    public w7.c d(o31.a aVar) {
        return new androidx.sqlite.db.framework.f((Context) aVar.c, (String) aVar.d, (v) aVar.e, aVar.a, aVar.b);
    }

    public com.github.domain.searchandfilter.filters.data.d l(String str) {
        if (str != null) {
            l81.b bVar = l81.c.d;
            bVar.getClass();
            RepositoryOwnerRepositoriesFilter repositoryOwnerRepositoriesFilter = (RepositoryOwnerRepositoriesFilter) bVar.a(str, RepositoryOwnerRepositoriesFilter.Companion.serializer());
            if (repositoryOwnerRepositoriesFilter != null) {
                return new RepositoryOwnerRepositoriesFilter(repositoryOwnerRepositoriesFilter.v);
            }
        }
        return new RepositoryOwnerRepositoriesFilter(r.r);
    }

    public e(o0 o0Var) {
        this.r = 9;
    }
}
