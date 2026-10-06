package com.github.rudroid.home.search.navigation;

import androidx.annotation.Keep;
import d71.a;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
/* loaded from: /home/user/work/p/classes.dex */
public final class SearchViewModelType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SearchViewModelType[] $VALUES;
    public static final SearchViewModelType ISSUE = new SearchViewModelType("ISSUE", 0);
    public static final SearchViewModelType ORGANIZATION = new SearchViewModelType("ORGANIZATION", 1);
    public static final SearchViewModelType REPOSITORY = new SearchViewModelType("REPOSITORY", 2);
    public static final SearchViewModelType PULL_REQUEST = new SearchViewModelType("PULL_REQUEST", 3);
    public static final SearchViewModelType USER = new SearchViewModelType("USER", 4);

    private static final /* synthetic */ SearchViewModelType[] $values() {
        return new SearchViewModelType[]{ISSUE, ORGANIZATION, REPOSITORY, PULL_REQUEST, USER};
    }

    static {
        SearchViewModelType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l0.t($values);
    }

    private SearchViewModelType(String str, int i) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static SearchViewModelType valueOf(String str) {
        return (SearchViewModelType) Enum.valueOf(SearchViewModelType.class, str);
    }

    public static SearchViewModelType[] values() {
        return (SearchViewModelType[]) $VALUES.clone();
    }

    public static Object name(Object... a) {
        return null;
    }
    public Object name() { return null; }
}
