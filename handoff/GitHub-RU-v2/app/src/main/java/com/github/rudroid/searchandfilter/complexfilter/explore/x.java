package com.github.rudroid.searchandfilter.complexfilter.explore;

import android.view.View;
import com.github.domain.searchandfilter.filters.data.SpokenLanguageFilter;
import com.github.rudroid.utilities.b3;
import com.github.service.models.response.SpokenLanguage;
import com.github.service.models.response.type.MobileSubjectType;

@c71.e(c = "com.github.rudroid.searchandfilter.complexfilter.explore.SelectableSpokenLanguageBottomSheet$onViewCreated$1", f = "SelectableSpokenLanguageBottomSheet.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class x extends c71.j implements j71.e {
    public /* synthetic */ Object v;
    public final /* synthetic */ SelectableSpokenLanguageBottomSheet w;
    public final /* synthetic */ View x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(SelectableSpokenLanguageBottomSheet selectableSpokenLanguageBottomSheet, View view, a71.c cVar) {
        super(2, cVar);
        this.w = selectableSpokenLanguageBottomSheet;
        this.x = view;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        x xVar = new x(this.w, this.x, cVar);
        xVar.v = obj;
        return xVar;
    }

    public final Object s(Object obj, Object obj2) {
        x r = r((a71.c) obj2, (SpokenLanguage) obj);
        w61.a0 a0Var = w61.a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        SpokenLanguage spokenLanguage = (SpokenLanguage) this.v;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        SelectableSpokenLanguageBottomSheet selectableSpokenLanguageBottomSheet = this.w;
        ((com.github.rudroid.searchandfilter.q) selectableSpokenLanguageBottomSheet.Z0.getValue()).Y(new SpokenLanguageFilter(spokenLanguage), MobileSubjectType.FILTER_TRENDING_SPOKEN_LANGUAGE);
        b3.a(this.x, new w(selectableSpokenLanguageBottomSheet, 1));
        return w61.a0.a;
    }
}
