package com.github.rudroid.searchandfilter.complexfilter.explore;

import android.view.View;
import com.github.domain.searchandfilter.filters.data.LanguageFilter;
import com.github.rudroid.utilities.b3;
import com.github.service.models.response.Language;
import com.github.service.models.response.type.MobileSubjectType;

@c71.e(c = "com.github.rudroid.searchandfilter.complexfilter.explore.SelectableLanguageBottomSheet$onViewCreated$1", f = "SelectableLanguageBottomSheet.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class d extends c71.j implements j71.e {
    public /* synthetic */ Object v;
    public final /* synthetic */ SelectableLanguageBottomSheet w;
    public final /* synthetic */ View x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(SelectableLanguageBottomSheet selectableLanguageBottomSheet, View view, a71.c cVar) {
        super(2, cVar);
        this.w = selectableLanguageBottomSheet;
        this.x = view;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        d dVar = new d(this.w, this.x, cVar);
        dVar.v = obj;
        return dVar;
    }

    public final Object s(Object obj, Object obj2) {
        d r = r((a71.c) obj2, (Language) obj);
        w61.a0 a0Var = w61.a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        Language language = (Language) this.v;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        SelectableLanguageBottomSheet selectableLanguageBottomSheet = this.w;
        ((com.github.rudroid.searchandfilter.q) selectableLanguageBottomSheet.a1.getValue()).Y(new LanguageFilter(language), MobileSubjectType.FILTER_LANGUAGE);
        b3.a(this.x, new c(selectableLanguageBottomSheet, 2));
        return w61.a0.a;
    }
}
