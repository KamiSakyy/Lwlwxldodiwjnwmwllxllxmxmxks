package com.github.rudroid.home.search.navigation;

import com.google.android.gms.internal.measurement.d5;
import j81.a;
import k71.k;
import k81.c1Shadow;
import k81.d0;
import k81.e1;
import k81.q1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import w61.c;
import w61.h;

@c
/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class SearchResultsRoute$$serializer implements d0 {
    public static final int $stable;
    public static final SearchResultsRoute$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SearchResultsRoute$$serializer searchResultsRoute$$serializer = new SearchResultsRoute$$serializer();
        INSTANCE = searchResultsRoute$$serializer;
        e1 e1Var = new e1("com.github.rudroid.home.search.navigation.SearchResultsRoute", searchResultsRoute$$serializer, 3);
        e1Var.l("viewModelType", false);
        e1Var.l("query", false);
        e1Var.l("title", false);
        descriptor = e1Var;
        $stable = 8;
    }

    private SearchResultsRoute$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KSerializer[] childSerializers() {
        q1 q1Var = q1.a;
        return new KSerializer[]{SearchResultsRoute.f15054u[0].getValue(), q1Var, q1Var};
    }

    /* renamed from: deserialize, reason: merged with bridge method [inline-methods] */
    public final SearchResultsRoute m40deserialize(Decoder decoder) {
        k.g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        a b10 = decoder.b(serialDescriptor);
        h[] hVarArr = SearchResultsRoute.f15054u;
        SearchViewModelType searchViewModelType = null;
        boolean z10 = true;
        int i = 0;
        String str = null;
        String str2 = null;
        while (z10) {
            int t10 = b10.t(serialDescriptor);
            if (t10 == -1) {
                z10 = false;
            } else if (t10 == 0) {
                searchViewModelType = (SearchViewModelType) b10.A(serialDescriptor, 0, (KSerializer) hVarArr[0].getValue(), searchViewModelType);
                i |= 1;
            } else if (t10 == 1) {
                str = b10.r(serialDescriptor, 1);
                i |= 2;
            } else {
                if (t10 != 2) {
                    throw new UnknownFieldException(t10);
                }
                str2 = b10.r(serialDescriptor, 2);
                i |= 4;
            }
        }
        b10.g(serialDescriptor);
        return new SearchResultsRoute(i, searchViewModelType, str, str2);
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, SearchResultsRoute searchResultsRoute) {
        k.g(encoder, "encoder");
        k.g(searchResultsRoute, "value");
        SerialDescriptor serialDescriptor = descriptor;
        d5 b10 = encoder.b(serialDescriptor);
        b10.I(serialDescriptor, 0, (KSerializer) SearchResultsRoute.f15054u[0].getValue(), searchResultsRoute.f15055r);
        b10.J(serialDescriptor, 1, searchResultsRoute.f15056s);
        b10.J(serialDescriptor, 2, searchResultsRoute.f15057t);
        b10.L(serialDescriptor);
    }

    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1Shadow.b;
    }
}
