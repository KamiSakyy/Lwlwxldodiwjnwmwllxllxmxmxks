package wh;

import aj.b;
import aj.d;
import aj.e;
import android.app.Application;
import androidx.lifecycle.k1;
import androidx.lifecycle.n1;
import com.github.rudroid.activities.util.c;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a extends n1 {
    public String e;
    public aj.a f;
    public b g;
    public d h;
    public e i;
    public c j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Application application, String str, aj.a aVar, b bVar, d dVar, e eVar, c cVar) {
        super(application);
        k.g(str, "autocompleteNodeId");
        k.g(bVar, "fetchDiscussionMentionableItemsUseCase");
        k.g(dVar, "fetchMentionableItemsUseCase");
        k.g(eVar, "fetchMentionableUsersUseCase");
        this.e = str;
        this.f = aVar;
        this.g = bVar;
        this.h = dVar;
        this.i = eVar;
        this.j = cVar;
    }

    public final k1 a(Class cls) {
        k.g(cls, "modelClass");
        return new com.github.rudroid.autocomplete.c(this.e, this.f, this.g, this.h, this.i, this.j);
    }
}
