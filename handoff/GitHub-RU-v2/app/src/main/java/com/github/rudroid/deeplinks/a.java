package com.github.rudroid.deeplinks;

import android.net.Uri;
import java.util.List;
import k71.k;
import v8.l0;
import x61.m;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f10627a = {"", "about", "account", "actions-beta", "admin", "advisories", "addons", "advisory-database", "advisory-db", "advisorydatabase", "advisorydb", "anonymous", "any", "api", "apple-app-site-association", "apps", "assets", "assets-cdn", "auth", "attributes", "avatars", "baitshop", "billing", "blob", "blog", "bounty", "branches", "branches", "brand", "buildingthefuture", "business", "businesses", "c", "cache", "callbacks", "camo", "careers", "categories", "central", "certification", "certifications", "changelog", "chat", "cla", "cloud", "codeload", "codeql", "codereview", "codesearch", "codespaces", "collection", "collections", "collector-cdn", "comments", "commits", "companies", "compare", "compare", "contact", "contributing", "cookbook", "coupons", "ctags", "customer", "customer-stories", "customers", "customers", "dashboard", "dashboards", "de", "dependency-insights", "design", "design-blog", "design-system", "design-team", "designs-system", "designs-systems", "develop", "developer", "developer-stories", "devtools", "diff", "difftool", "discover", "discussion_messages", "discussions", "downloads", "downtime", "earlyaccess", "edit_repositories", "editor", "editors", "edu", "email", "enterprise", "enterprise-cloud", "enterprise-docs", "enterprise-legal", "enterprise-server", "enterprises", "error_pages", "events", "experience", "explore", "featured", "features", "file-servers", "files", "fixtures", "forked", "fr", "g1thub", "game-off", "gameoff", "garage", "generated_pages", "geocities", "getting-started", "gist", "gist-assets", "gist-raw", "gists", "github-apps", "github-design-systems", "github_spark_waitlist_signup", "gitlfs", "glthub", "graphs", "guide", "guides", "halp", "help", "help-wanted", "home", "hooks", "hosting", "identicons", "identity", "images", "inbox", "individual", "info", "integration", "interfaces", "introduction", "investors", "javascripts", "jobs", "join", "journal", "journals", "jump-to", "lab", "labs", "languages", "launch", "layouts", "learn", "legal", "libgit2-ci", "library", "linux", "listings", "lists", "login", "logos", "logout", "mac", "machine-room", "mailers", "maintenance", "malware", "man", "marketplace", "mcp", "media", "mention", "mentioned", "mentioning", "mentions", "messages", "migrating", "milestones", "milestones_next", "mine", "mirrors", "mobile", "mona-sans", "navigation", "network", "new", "new", "news", "non-profits", "none", "nonprofit", "nonprofits", "notices", "notifications", "oauth", "oauth_applications", "octicons", "octodex", "oembed", "offer", "open-source", "openscripts", "opensource", "organisations", "organizations", "owners", "packages", "page", "pages", "partners", "password_reset", "payments", "personal", "plans", "plugins", "popular", "popularity", "posts", "press", "pricing", "professional", "projects", "public_keys", "pull_requests", "raw", "readme", "recommendations", "redeem", "render", "reply", "repositories", "repository_cards", "repository_search", "resources", "resources-library", "restore", "revert", "roadmap", "saved", "scraping", "search", "security", "security-advisories", "security-research-lab", "services", "sessions", "session", "settings", "shareholders", "shop", "showcases", "signin", "signup", "site", "slowtown", "solutions", "spam", "spark", "spamurai", "spider-skull-island", "sponsors", "ssh", "staff", "stafftools", "starred", "stars", "static", "status", "statuses", "storage", "store", "stories", "styleguide", "submodules", "subscriptions", "sudo", "suggest", "suggestion", "suggestions", "support", "survey-responses", "suspended", "talks", "teach", "teacher", "teachers", "teaching", "team", "teams", "ten", "tenderp", "terms", "the-website", "thecream", "thewebsite", "timeline", "topic", "topics", "tos", "tour", "train", "training", "translations", "tree", "trending", "u2f", "universe-2016", "universe-2017", "universe-2018", "universe-2019", "universe-2020", "universe-2021", "universe-2022", "universe-2023", "universe-2024", "universe-2025", "updates", "uploads", "userbox", "username", "visualisation", "visualization", "w", "waitlist", "web_hooks", "webcasts", "webinars", "wiki", "wiki-raw", "windows", "works-with", "worldtour", "www0", "www1", "www2", "www3", "www4", "www6", "www7", "www5", "www8", "www9", "newsletter", "accelerator", "education", "social-impact", "why-github", "newsroom", "trust-center", "all-in-open-source", "contact-sales", "frequently-asked-questions", "github-and-vscode", "github-outreach", "renewals-help", "roadmap-webinar-series"};

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.github.rudroid.deeplinks.a$a, reason: collision with other inner class name */
    public static final class EnumC0023a {
        public static final EnumC0023a A;
        public static final EnumC0023a B;
        public static final EnumC0023a C;
        public static final EnumC0023a D;
        public static final EnumC0023a E;
        public static final EnumC0023a F;
        public static final /* synthetic */ EnumC0023a[] G;

        /* renamed from: s, reason: collision with root package name */
        public static final EnumC0023a f10628s;

        /* renamed from: t, reason: collision with root package name */
        public static final EnumC0023a f10629t;

        /* renamed from: u, reason: collision with root package name */
        public static final EnumC0023a f10630u;

        /* renamed from: v, reason: collision with root package name */
        public static final EnumC0023a f10631v;

        /* renamed from: w, reason: collision with root package name */
        public static final EnumC0023a f10632w;

        /* renamed from: x, reason: collision with root package name */
        public static final EnumC0023a f10633x;

        /* renamed from: y, reason: collision with root package name */
        public static final EnumC0023a f10634y;

        /* renamed from: z, reason: collision with root package name */
        public static final EnumC0023a f10635z;

        /* renamed from: r, reason: collision with root package name */
        public String f10636r;

        static {
            EnumC0023a enumC0023a = new EnumC0023a("SESSION", 0, "session");
            f10628s = enumC0023a;
            EnumC0023a enumC0023a2 = new EnumC0023a("SESSIONS", 1, "sessions");
            f10629t = enumC0023a2;
            EnumC0023a enumC0023a3 = new EnumC0023a("LOGIN", 2, "login");
            f10630u = enumC0023a3;
            EnumC0023a enumC0023a4 = new EnumC0023a("OAUTH", 3, "oauth");
            f10631v = enumC0023a4;
            EnumC0023a enumC0023a5 = new EnumC0023a("LOGOUT", 4, "logout");
            f10632w = enumC0023a5;
            EnumC0023a enumC0023a6 = new EnumC0023a("SIGNUP", 5, "signup");
            f10633x = enumC0023a6;
            EnumC0023a enumC0023a7 = new EnumC0023a("JOIN", 6, "join");
            f10634y = enumC0023a7;
            EnumC0023a enumC0023a8 = new EnumC0023a("SUSPENDED", 7, "suspended");
            f10635z = enumC0023a8;
            EnumC0023a enumC0023a9 = new EnumC0023a("PASSWORD_RESET", 8, "password_reset");
            A = enumC0023a9;
            EnumC0023a enumC0023a10 = new EnumC0023a("SWITCH_ACCOUNT", 9, "switch_account");
            B = enumC0023a10;
            EnumC0023a enumC0023a11 = new EnumC0023a("AUTH", 10, "auth");
            C = enumC0023a11;
            EnumC0023a enumC0023a12 = new EnumC0023a("SAML", 11, "saml");
            D = enumC0023a12;
            EnumC0023a enumC0023a13 = new EnumC0023a("ACCOUNT_VERIFICATIONS", 12, "account_verifications");
            E = enumC0023a13;
            EnumC0023a enumC0023a14 = new EnumC0023a("ACCOUNT_VERIFICATION", 13, "account_verification");
            F = enumC0023a14;
            EnumC0023a[] enumC0023aArr = {enumC0023a, enumC0023a2, enumC0023a3, enumC0023a4, enumC0023a5, enumC0023a6, enumC0023a7, enumC0023a8, enumC0023a9, enumC0023a10, enumC0023a11, enumC0023a12, enumC0023a13, enumC0023a14};
            G = enumC0023aArr;
            l0.t(enumC0023aArr);
        }

        public EnumC0023a(String str, int i, String str2) {
            this.f10636r = str2;
        }

        public static EnumC0023a valueOf(String str) {
            return (EnumC0023a) Enum.valueOf(EnumC0023a.class, str);
        }

        public static EnumC0023a[] values() {
            return (EnumC0023a[]) G.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {

        /* renamed from: a6, reason: collision with root package name */
        public static final /* synthetic */ b[] f10643a6;

        /* renamed from: r, reason: collision with root package name */
        public String f10793r;

        /* renamed from: s, reason: collision with root package name */
        public static final b f10741s = new b("ABOUT", 0, "about");

        /* renamed from: t, reason: collision with root package name */
        public static final b f10747t = new b("ACCOUNT", 1, "account");

        /* renamed from: u, reason: collision with root package name */
        public static final b f10754u = new b("ACTIONS_BETA", 2, "actions-beta");

        /* renamed from: v, reason: collision with root package name */
        public static final b f10761v = new b("ADMIN", 3, "admin");

        /* renamed from: w, reason: collision with root package name */
        public static final b f10767w = new b("ADVISORIES", 4, "advisories");

        /* renamed from: x, reason: collision with root package name */
        public static final b f10774x = new b("ADDONS", 5, "addons");

        /* renamed from: y, reason: collision with root package name */
        public static final b f10780y = new b("ADVISORY_DATABASE", 6, "advisory-database");

        /* renamed from: z, reason: collision with root package name */
        public static final b f10786z = new b("ADVISORY_DB", 7, "advisory-db");
        public static final b A = new b("ADVISORYDATABASE", 8, "advisorydatabase");
        public static final b B = new b("ADVISORYDB", 9, "advisorydb");
        public static final b C = new b("ANONYMOUS", 10, "anonymous");
        public static final b D = new b("ANY", 11, "any");
        public static final b E = new b("API", 12, "api");
        public static final b F = new b("APPLE_APP_SITE_ASSOCIATION", 13, "apple-app-site-association");
        public static final b G = new b("APPS", 14, "apps");
        public static final b H = new b("ASSETS", 15, "assets");
        public static final b I = new b("ASSETS_CDN", 16, "assets-cdn");
        public static final b J = new b("ATTRIBUTES", 17, "attributes");
        public static final b K = new b("AVATARS", 18, "avatars");
        public static final b L = new b("BAITSHOP", 19, "baitshop");
        public static final b M = new b("BILLING", 20, "billing");
        public static final b N = new b("BLOB", 21, "blob");
        public static final b O = new b("BLOG", 22, "blog");
        public static final b P = new b("BOUNTY", 23, "bounty");
        public static final b Q = new b("BRANCHES", 24, "branches");
        public static final b R = new b("BRAND", 25, "brand");
        public static final b S = new b("BUILDINGTHEFUTURE", 26, "buildingthefuture");
        public static final b T = new b("BUSINESS", 27, "business");
        public static final b U = new b("BUSINESSES", 28, "businesses");
        public static final b V = new b("C", 29, "c");
        public static final b W = new b("CACHE", 30, "cache");
        public static final b X = new b("CALLBACKS", 31, "callbacks");
        public static final b Y = new b("CAMO", 32, "camo");
        public static final b Z = new b("CAREERS", 33, "careers");

        /* renamed from: a0, reason: collision with root package name */
        public static final b f10637a0 = new b("CATEGORIES", 34, "categories");

        /* renamed from: b0, reason: collision with root package name */
        public static final b f10644b0 = new b("CENTRAL", 35, "central");

        /* renamed from: c0, reason: collision with root package name */
        public static final b f10650c0 = new b("CERTIFICATION", 36, "certification");

        /* renamed from: d0, reason: collision with root package name */
        public static final b f10656d0 = new b("CERTIFICATIONS", 37, "certifications");

        /* renamed from: e0, reason: collision with root package name */
        public static final b f10662e0 = new b("CHANGELOG", 38, "changelog");

        /* renamed from: f0, reason: collision with root package name */
        public static final b f10667f0 = new b("CHAT", 39, "chat");

        /* renamed from: g0, reason: collision with root package name */
        public static final b f10673g0 = new b("CLA", 40, "cla");

        /* renamed from: h0, reason: collision with root package name */
        public static final b f10679h0 = new b("CLOUD", 41, "cloud");

        /* renamed from: i0, reason: collision with root package name */
        public static final b f10685i0 = new b("CODELOAD", 42, "codeload");

        /* renamed from: j0, reason: collision with root package name */
        public static final b f10691j0 = new b("CODEQL", 43, "codeql");

        /* renamed from: k0, reason: collision with root package name */
        public static final b f10697k0 = new b("CODEREVIEW", 44, "codereview");

        /* renamed from: l0, reason: collision with root package name */
        public static final b f10703l0 = new b("CODESEARCH", 45, "codesearch");

        /* renamed from: m0, reason: collision with root package name */
        public static final b f10708m0 = new b("CODESPACES", 46, "codespaces");

        /* renamed from: n0, reason: collision with root package name */
        public static final b f10714n0 = new b("COLLECTION", 47, "collection");

        /* renamed from: o0, reason: collision with root package name */
        public static final b f10720o0 = new b("COLLECTIONS", 48, "collections");

        /* renamed from: p0, reason: collision with root package name */
        public static final b f10725p0 = new b("COLLECTOR_CDN", 49, "collector-cdn");

        /* renamed from: q0, reason: collision with root package name */
        public static final b f10729q0 = new b("COMMENTS", 50, "comments");

        /* renamed from: r0, reason: collision with root package name */
        public static final b f10735r0 = new b("COMMITS", 51, "commits");

        /* renamed from: s0, reason: collision with root package name */
        public static final b f10742s0 = new b("COMPANIES", 52, "companies");

        /* renamed from: t0, reason: collision with root package name */
        public static final b f10748t0 = new b("COMPARE", 53, "compare");

        /* renamed from: u0, reason: collision with root package name */
        public static final b f10755u0 = new b("CONTACT", 54, "contact");

        /* renamed from: v0, reason: collision with root package name */
        public static final b f10762v0 = new b("CONTRIBUTING", 55, "contributing");

        /* renamed from: w0, reason: collision with root package name */
        public static final b f10768w0 = new b("COOKBOOK", 56, "cookbook");

        /* renamed from: x0, reason: collision with root package name */
        public static final b f10775x0 = new b("COUPONS", 57, "coupons");

        /* renamed from: y0, reason: collision with root package name */
        public static final b f10781y0 = new b("CTAGS", 58, "ctags");

        /* renamed from: z0, reason: collision with root package name */
        public static final b f10787z0 = new b("CUSTOMER", 59, "customer");
        public static final b A0 = new b("CUSTOMER_STORIES", 60, "customer-stories");
        public static final b B0 = new b("CUSTOMERS", 61, "customers");
        public static final b C0 = new b("DASHBOARD", 62, "dashboard");
        public static final b D0 = new b("DASHBOARDS", 63, "dashboards");
        public static final b E0 = new b("DE", 64, "de");
        public static final b F0 = new b("DEPENDENCY_INSIGHTS", 65, "dependency-insights");
        public static final b G0 = new b("DESIGN", 66, "design");
        public static final b H0 = new b("DESIGN_BLOG", 67, "design-blog");
        public static final b I0 = new b("DESIGN_SYSTEM", 68, "design-system");
        public static final b J0 = new b("DESIGN_TEAM", 69, "design-team");
        public static final b K0 = new b("DESIGNS_SYSTEM", 70, "designs-system");
        public static final b L0 = new b("DESIGNS_SYSTEMS", 71, "designs-systems");
        public static final b M0 = new b("DEVELOP", 72, "develop");
        public static final b N0 = new b("DEVELOPER", 73, "developer");
        public static final b O0 = new b("DEVELOPER_STORIES", 74, "developer-stories");
        public static final b P0 = new b("DEVTOOLS", 75, "devtools");
        public static final b Q0 = new b("DIFF", 76, "diff");
        public static final b R0 = new b("DIFFTOOL", 77, "difftool");
        public static final b S0 = new b("DISCOVER", 78, "discover");
        public static final b T0 = new b("DISCUSSION_MESSAGES", 79, "discussion_messages");
        public static final b U0 = new b("DISCUSSIONS", 80, "discussions");
        public static final b V0 = new b("DOWNLOADS", 81, "downloads");
        public static final b W0 = new b("DOWNTIME", 82, "downtime");
        public static final b X0 = new b("EARLYACCESS", 83, "earlyaccess");
        public static final b Y0 = new b("EDIT_REPOSITORIES", 84, "edit_repositories");
        public static final b Z0 = new b("EDITOR", 85, "editor");

        /* renamed from: a1, reason: collision with root package name */
        public static final b f10638a1 = new b("EDITORS", 86, "editors");

        /* renamed from: b1, reason: collision with root package name */
        public static final b f10645b1 = new b("EDU", 87, "edu");

        /* renamed from: c1, reason: collision with root package name */
        public static final b f10651c1 = new b("EMAIL", 88, "email");

        /* renamed from: d1, reason: collision with root package name */
        public static final b f10657d1 = new b("ENTERPRISE", 89, "enterprise");

        /* renamed from: e1, reason: collision with root package name */
        public static final b f10663e1 = new b("ENTERPRISE_CLOUD", 90, "enterprise-cloud");

        /* renamed from: f1, reason: collision with root package name */
        public static final b f10668f1 = new b("ENTERPRISE_DOCS", 91, "enterprise-docs");

        /* renamed from: g1, reason: collision with root package name */
        public static final b f10674g1 = new b("ENTERPRISE_LEGAL", 92, "enterprise-legal");

        /* renamed from: h1, reason: collision with root package name */
        public static final b f10680h1 = new b("ENTERPRISE_SERVER", 93, "enterprise-server");

        /* renamed from: i1, reason: collision with root package name */
        public static final b f10686i1 = new b("ENTERPRISES", 94, "enterprises");

        /* renamed from: j1, reason: collision with root package name */
        public static final b f10692j1 = new b("ERROR_PAGES", 95, "error_pages");

        /* renamed from: k1, reason: collision with root package name */
        public static final b f10698k1 = new b("EVENTS", 96, "events");

        /* renamed from: l1, reason: collision with root package name */
        public static final b f10704l1 = new b("EXPERIENCE", 97, "experience");

        /* renamed from: m1, reason: collision with root package name */
        public static final b f10709m1 = new b("EXPLORE", 98, "explore");

        /* renamed from: n1, reason: collision with root package name */
        public static final b f10715n1 = new b("FEATURED", 99, "featured");

        /* renamed from: o1, reason: collision with root package name */
        public static final b f10721o1 = new b("FEATURES", 100, "features");

        /* renamed from: p1, reason: collision with root package name */
        public static final b f10726p1 = new b("FILE_SERVERS", 101, "file-servers");

        /* renamed from: q1, reason: collision with root package name */
        public static final b f10730q1 = new b("FILES", 102, "files");

        /* renamed from: r1, reason: collision with root package name */
        public static final b f10736r1 = new b("FIXTURES", 103, "fixtures");

        /* renamed from: s1, reason: collision with root package name */
        public static final b f10743s1 = new b("FORKED", 104, "forked");

        /* renamed from: t1, reason: collision with root package name */
        public static final b f10749t1 = new b("FR", 105, "fr");

        /* renamed from: u1, reason: collision with root package name */
        public static final b f10756u1 = new b("G1THUB", 106, "g1thub");

        /* renamed from: v1, reason: collision with root package name */
        public static final b f10763v1 = new b("GAME_OFF", 107, "game-off");

        /* renamed from: w1, reason: collision with root package name */
        public static final b f10769w1 = new b("GAMEOFF", 108, "gameoff");

        /* renamed from: x1, reason: collision with root package name */
        public static final b f10776x1 = new b("GARAGE", 109, "garage");

        /* renamed from: y1, reason: collision with root package name */
        public static final b f10782y1 = new b("GENERATED_PAGES", 110, "generated_pages");

        /* renamed from: z1, reason: collision with root package name */
        public static final b f10788z1 = new b("GEOCITIES", 111, "geocities");
        public static final b A1 = new b("GETTING_STARTED", 112, "getting-started");
        public static final b B1 = new b("GIST", 113, "gist");
        public static final b C1 = new b("GIST_ASSETS", 114, "gist-assets");
        public static final b D1 = new b("GIST_RAW", 115, "gist-raw");
        public static final b E1 = new b("GISTS", 116, "gists");
        public static final b F1 = new b("GITHUB_APPS", 117, "github-apps");
        public static final b G1 = new b("GITHUB_DESIGN_SYSTEMS", 118, "github-design-systems");
        public static final b H1 = new b("GITHUB_SPARK_WAITLIST_SIGNUP", 119, "github_spark_waitlist_signup");
        public static final b I1 = new b("GITLFS", 120, "gitlfs");
        public static final b J1 = new b("GLTHUB", 121, "glthub");
        public static final b K1 = new b("GRAPHS", 122, "graphs");
        public static final b L1 = new b("GUIDE", 123, "guide");
        public static final b M1 = new b("GUIDES", 124, "guides");
        public static final b N1 = new b("HALP", 125, "halp");
        public static final b O1 = new b("HELP", 126, "help");
        public static final b P1 = new b("HELP_WANTED", 127, "help-wanted");
        public static final b Q1 = new b("HOME", 128, "home");
        public static final b R1 = new b("HOOKS", 129, "hooks");
        public static final b S1 = new b("HOSTING", 130, "hosting");
        public static final b T1 = new b("IDENTICONS", 131, "identicons");
        public static final b U1 = new b("IDENTITY", 132, "identity");
        public static final b V1 = new b("IMAGES", 133, "images");
        public static final b W1 = new b("INBOX", 134, "inbox");
        public static final b X1 = new b("INDIVIDUAL", 135, "individual");
        public static final b Y1 = new b("INFO", 136, "info");
        public static final b Z1 = new b("INTEGRATION", 137, "integration");

        /* renamed from: a2, reason: collision with root package name */
        public static final b f10639a2 = new b("INTERFACES", 138, "interfaces");

        /* renamed from: b2, reason: collision with root package name */
        public static final b f10646b2 = new b("INTRODUCTION", 139, "introduction");

        /* renamed from: c2, reason: collision with root package name */
        public static final b f10652c2 = new b("INVESTORS", 140, "investors");

        /* renamed from: d2, reason: collision with root package name */
        public static final b f10658d2 = new b("JAVASCRIPTS", 141, "javascripts");

        /* renamed from: e2, reason: collision with root package name */
        public static final b f10664e2 = new b("JOBS", 142, "jobs");

        /* renamed from: f2, reason: collision with root package name */
        public static final b f10669f2 = new b("JOURNAL", 143, "journal");

        /* renamed from: g2, reason: collision with root package name */
        public static final b f10675g2 = new b("JOURNALS", 144, "journals");

        /* renamed from: h2, reason: collision with root package name */
        public static final b f10681h2 = new b("JUMP_TO", 145, "jump-to");

        /* renamed from: i2, reason: collision with root package name */
        public static final b f10687i2 = new b("LAB", 146, "lab");

        /* renamed from: j2, reason: collision with root package name */
        public static final b f10693j2 = new b("LABS", 147, "labs");

        /* renamed from: k2, reason: collision with root package name */
        public static final b f10699k2 = new b("LANGUAGES", 148, "languages");

        /* renamed from: l2, reason: collision with root package name */
        public static final b f10705l2 = new b("LAUNCH", 149, "launch");

        /* renamed from: m2, reason: collision with root package name */
        public static final b f10710m2 = new b("LAYOUTS", 150, "layouts");

        /* renamed from: n2, reason: collision with root package name */
        public static final b f10716n2 = new b("LEARN", 151, "learn");

        /* renamed from: o2, reason: collision with root package name */
        public static final b f10722o2 = new b("LEGAL", 152, "legal");

        /* renamed from: p2, reason: collision with root package name */
        public static final b f10727p2 = new b("LIBGIT2_CI", 153, "libgit2-ci");

        /* renamed from: q2, reason: collision with root package name */
        public static final b f10731q2 = new b("LIBRARY", 154, "library");

        /* renamed from: r2, reason: collision with root package name */
        public static final b f10737r2 = new b("LINUX", 155, "linux");
        public static final b s2 = new b("LISTINGS", 156, "listings");

        /* renamed from: t2, reason: collision with root package name */
        public static final b f10750t2 = new b("LISTS", 157, "lists");

        /* renamed from: u2, reason: collision with root package name */
        public static final b f10757u2 = new b("LOGOS", 158, "logos");

        /* renamed from: v2, reason: collision with root package name */
        public static final b f10764v2 = new b("MAC", 159, "mac");

        /* renamed from: w2, reason: collision with root package name */
        public static final b f10770w2 = new b("MACHINE_ROOM", 160, "machine-room");
        public static final b x2 = new b("MAILERS", 161, "mailers");
        public static final b y2 = new b("MAINTENANCE", 162, "maintenance");

        /* renamed from: z2, reason: collision with root package name */
        public static final b f10789z2 = new b("MALWARE", 163, "malware");
        public static final b A2 = new b("MAN", 164, "man");
        public static final b B2 = new b("MARKETPLACE", 165, "marketplace");
        public static final b C2 = new b("MCP", 166, "mcp");
        public static final b D2 = new b("MEDIA", 167, "media");
        public static final b E2 = new b("MENTION", 168, "mention");
        public static final b F2 = new b("MENTIONED", 169, "mentioned");
        public static final b G2 = new b("MENTIONING", 170, "mentioning");
        public static final b H2 = new b("MENTIONS", 171, "mentions");
        public static final b I2 = new b("MESSAGES", 172, "messages");
        public static final b J2 = new b("MIGRATING", 173, "migrating");
        public static final b K2 = new b("MILESTONES", 174, "milestones");
        public static final b L2 = new b("MILESTONES_NEXT", 175, "milestones_next");
        public static final b M2 = new b("MINE", 176, "mine");
        public static final b N2 = new b("MIRRORS", 177, "mirrors");
        public static final b O2 = new b("MOBILE", 178, "mobile");
        public static final b P2 = new b("MONA_SANS", 179, "mona-sans");
        public static final b Q2 = new b("NAVIGATION", 180, "navigation");
        public static final b R2 = new b("NETWORK", 181, "network");
        public static final b S2 = new b("NEW", 182, "new");
        public static final b T2 = new b("NEWS", 183, "news");
        public static final b U2 = new b("NON_PROFITS", 184, "non-profits");
        public static final b V2 = new b("NONE", 185, "none");
        public static final b W2 = new b("NONPROFIT", 186, "nonprofit");
        public static final b X2 = new b("NONPROFITS", 187, "nonprofits");
        public static final b Y2 = new b("NOTICES", 188, "notices");
        public static final b Z2 = new b("NOTIFICATIONS", 189, "notifications");

        /* renamed from: a3, reason: collision with root package name */
        public static final b f10640a3 = new b("OAUTH_APPLICATIONS", 190, "oauth_applications");

        /* renamed from: b3, reason: collision with root package name */
        public static final b f10647b3 = new b("OCTICONS", 191, "octicons");

        /* renamed from: c3, reason: collision with root package name */
        public static final b f10653c3 = new b("OCTODEX", 192, "octodex");

        /* renamed from: d3, reason: collision with root package name */
        public static final b f10659d3 = new b("OEMBED", 193, "oembed");

        /* renamed from: e3, reason: collision with root package name */
        public static final b f10665e3 = new b("OFFER", 194, "offer");

        /* renamed from: f3, reason: collision with root package name */
        public static final b f10670f3 = new b("OPEN_SOURCE", 195, "open-source");

        /* renamed from: g3, reason: collision with root package name */
        public static final b f10676g3 = new b("OPENSCRIPTS", 196, "openscripts");

        /* renamed from: h3, reason: collision with root package name */
        public static final b f10682h3 = new b("OPENSOURCE", 197, "opensource");

        /* renamed from: i3, reason: collision with root package name */
        public static final b f10688i3 = new b("ORGANISATIONS", 198, "organisations");

        /* renamed from: j3, reason: collision with root package name */
        public static final b f10694j3 = new b("ORGANIZATIONS", 199, "organizations");

        /* renamed from: k3, reason: collision with root package name */
        public static final b f10700k3 = new b("OWNERS", 200, "owners");

        /* renamed from: l3, reason: collision with root package name */
        public static final b f10706l3 = new b("PACKAGES", 201, "packages");

        /* renamed from: m3, reason: collision with root package name */
        public static final b f10711m3 = new b("PAGE", 202, "page");

        /* renamed from: n3, reason: collision with root package name */
        public static final b f10717n3 = new b("PAGES", 203, "pages");

        /* renamed from: o3, reason: collision with root package name */
        public static final b f10723o3 = new b("PARTNERS", 204, "partners");
        public static final b p3 = new b("PAYMENTS", 205, "payments");

        /* renamed from: q3, reason: collision with root package name */
        public static final b f10732q3 = new b("PERSONAL", 206, "personal");

        /* renamed from: r3, reason: collision with root package name */
        public static final b f10738r3 = new b("PLANS", 207, "plans");

        /* renamed from: s3, reason: collision with root package name */
        public static final b f10744s3 = new b("PLUGINS", 208, "plugins");

        /* renamed from: t3, reason: collision with root package name */
        public static final b f10751t3 = new b("POPULAR", 209, "popular");

        /* renamed from: u3, reason: collision with root package name */
        public static final b f10758u3 = new b("POPULARITY", 210, "popularity");

        /* renamed from: v3, reason: collision with root package name */
        public static final b f10765v3 = new b("POSTS", 211, "posts");

        /* renamed from: w3, reason: collision with root package name */
        public static final b f10771w3 = new b("PRESS", 212, "press");

        /* renamed from: x3, reason: collision with root package name */
        public static final b f10777x3 = new b("PRICING", 213, "pricing");

        /* renamed from: y3, reason: collision with root package name */
        public static final b f10783y3 = new b("PROFESSIONAL", 214, "professional");

        /* renamed from: z3, reason: collision with root package name */
        public static final b f10790z3 = new b("PROJECTS", 215, "projects");
        public static final b A3 = new b("PUBLIC_KEYS", 216, "public_keys");
        public static final b B3 = new b("PULL_REQUESTS", 217, "pull_requests");
        public static final b C3 = new b("RAW", 218, "raw");
        public static final b D3 = new b("README", 219, "readme");
        public static final b E3 = new b("RECOMMENDATIONS", 220, "recommendations");
        public static final b F3 = new b("REDEEM", 221, "redeem");
        public static final b G3 = new b("RENDER", 222, "render");
        public static final b H3 = new b("REPLY", 223, "reply");
        public static final b I3 = new b("REPOSITORIES", 224, "repositories");
        public static final b J3 = new b("REPOSITORY_CARDS", 225, "repository_cards");
        public static final b K3 = new b("REPOSITORY_SEARCH", 226, "repository_search");
        public static final b L3 = new b("RESOURCES", 227, "resources");
        public static final b M3 = new b("RESOURCES_LIBRARY", 228, "resources-library");
        public static final b N3 = new b("RESTORE", 229, "restore");
        public static final b O3 = new b("REVERT", 230, "revert");
        public static final b P3 = new b("ROADMAP", 231, "roadmap");
        public static final b Q3 = new b("SAVED", 232, "saved");
        public static final b R3 = new b("SCRAPING", 233, "scraping");
        public static final b S3 = new b("SEARCH", 234, "search");
        public static final b T3 = new b("SECURITY", 235, "security");
        public static final b U3 = new b("SECURITY_ADVISORIES", 236, "security-advisories");
        public static final b V3 = new b("SECURITY_RESEARCH_LAB", 237, "security-research-lab");
        public static final b W3 = new b("SERVICES", 238, "services");
        public static final b X3 = new b("SETTINGS", 239, "settings");
        public static final b Y3 = new b("SHAREHOLDERS", 240, "shareholders");
        public static final b Z3 = new b("SHOP", 241, "shop");

        /* renamed from: a4, reason: collision with root package name */
        public static final b f10641a4 = new b("SHOWCASES", 242, "showcases");

        /* renamed from: b4, reason: collision with root package name */
        public static final b f10648b4 = new b("SIGNIN", 243, "signin");

        /* renamed from: c4, reason: collision with root package name */
        public static final b f10654c4 = new b("SITE", 244, "site");

        /* renamed from: d4, reason: collision with root package name */
        public static final b f10660d4 = new b("SLOWTOWN", 245, "slowtown");

        /* renamed from: e4, reason: collision with root package name */
        public static final b f10666e4 = new b("SOLUTIONS", 246, "solutions");

        /* renamed from: f4, reason: collision with root package name */
        public static final b f10671f4 = new b("SPAM", 247, "spam");

        /* renamed from: g4, reason: collision with root package name */
        public static final b f10677g4 = new b("SPARK", 248, "spark");

        /* renamed from: h4, reason: collision with root package name */
        public static final b f10683h4 = new b("SPAMURAI", 249, "spamurai");

        /* renamed from: i4, reason: collision with root package name */
        public static final b f10689i4 = new b("SPIDER_SKULL_ISLAND", 250, "spider-skull-island");

        /* renamed from: j4, reason: collision with root package name */
        public static final b f10695j4 = new b("SPONSORS", 251, "sponsors");

        /* renamed from: k4, reason: collision with root package name */
        public static final b f10701k4 = new b("SSH", 252, "ssh");

        /* renamed from: l4, reason: collision with root package name */
        public static final b f10707l4 = new b("STAFF", 253, "staff");

        /* renamed from: m4, reason: collision with root package name */
        public static final b f10712m4 = new b("STAFFTOOLS", 254, "stafftools");

        /* renamed from: n4, reason: collision with root package name */
        public static final b f10718n4 = new b("STARRED", 255, "starred");

        /* renamed from: o4, reason: collision with root package name */
        public static final b f10724o4 = new b("STARS", 256, "stars");
        public static final b p4 = new b("STATIC", 257, "static");

        /* renamed from: q4, reason: collision with root package name */
        public static final b f10733q4 = new b("STATUS", 258, "status");

        /* renamed from: r4, reason: collision with root package name */
        public static final b f10739r4 = new b("STATUSES", 259, "statuses");

        /* renamed from: s4, reason: collision with root package name */
        public static final b f10745s4 = new b("STORAGE", 260, "storage");

        /* renamed from: t4, reason: collision with root package name */
        public static final b f10752t4 = new b("STORE", 261, "store");

        /* renamed from: u4, reason: collision with root package name */
        public static final b f10759u4 = new b("STORIES", 262, "stories");
        public static final b v4 = new b("STYLEGUIDE", 263, "styleguide");

        /* renamed from: w4, reason: collision with root package name */
        public static final b f10772w4 = new b("SUBMODULES", 264, "submodules");

        /* renamed from: x4, reason: collision with root package name */
        public static final b f10778x4 = new b("SUBSCRIPTIONS", 265, "subscriptions");

        /* renamed from: y4, reason: collision with root package name */
        public static final b f10784y4 = new b("SUDO", 266, "sudo");

        /* renamed from: z4, reason: collision with root package name */
        public static final b f10791z4 = new b("SUGGEST", 267, "suggest");
        public static final b A4 = new b("SUGGESTION", 268, "suggestion");
        public static final b B4 = new b("SUGGESTIONS", 269, "suggestions");
        public static final b C4 = new b("SUPPORT", 270, "support");
        public static final b D4 = new b("SURVEY_RESPONSES", 271, "survey-responses");
        public static final b E4 = new b("TALKS", 272, "talks");
        public static final b F4 = new b("TEACH", 273, "teach");
        public static final b G4 = new b("TEACHER", 274, "teacher");
        public static final b H4 = new b("TEACHERS", 275, "teachers");
        public static final b I4 = new b("TEACHING", 276, "teaching");
        public static final b J4 = new b("TEAM", 277, "team");
        public static final b K4 = new b("TEAMS", 278, "teams");
        public static final b L4 = new b("TEN", 279, "ten");
        public static final b M4 = new b("TENDERP", 280, "tenderp");
        public static final b N4 = new b("TERMS", 281, "terms");
        public static final b O4 = new b("THE_WEBSITE", 282, "the-website");
        public static final b P4 = new b("THECREAM", 283, "thecream");
        public static final b Q4 = new b("THEWEBSITE", 284, "thewebsite");
        public static final b R4 = new b("TIMELINE", 285, "timeline");
        public static final b S4 = new b("TOPIC", 286, "topic");
        public static final b T4 = new b("TOPICS", 287, "topics");
        public static final b U4 = new b("TOS", 288, "tos");
        public static final b V4 = new b("TOUR", 289, "tour");
        public static final b W4 = new b("TRAIN", 290, "train");
        public static final b X4 = new b("TRAINING", 291, "training");
        public static final b Y4 = new b("TRANSLATIONS", 292, "translations");
        public static final b Z4 = new b("TREE", 293, "tree");

        /* renamed from: a5, reason: collision with root package name */
        public static final b f10642a5 = new b("TRENDING", 294, "trending");

        /* renamed from: b5, reason: collision with root package name */
        public static final b f10649b5 = new b("U2F", 295, "u2f");

        /* renamed from: c5, reason: collision with root package name */
        public static final b f10655c5 = new b("UNIVERSE_2016", 296, "universe-2016");

        /* renamed from: d5, reason: collision with root package name */
        public static final b f10661d5 = new b("UNIVERSE_2017", 297, "universe-2017");
        public static final b e5 = new b("UNIVERSE_2018", 298, "universe-2018");

        /* renamed from: f5, reason: collision with root package name */
        public static final b f10672f5 = new b("UNIVERSE_2019", 299, "universe-2019");

        /* renamed from: g5, reason: collision with root package name */
        public static final b f10678g5 = new b("UNIVERSE_2020", 300, "universe-2020");

        /* renamed from: h5, reason: collision with root package name */
        public static final b f10684h5 = new b("UNIVERSE_2021", 301, "universe-2021");

        /* renamed from: i5, reason: collision with root package name */
        public static final b f10690i5 = new b("UNIVERSE_2022", 302, "universe-2022");

        /* renamed from: j5, reason: collision with root package name */
        public static final b f10696j5 = new b("UNIVERSE_2023", 303, "universe-2023");

        /* renamed from: k5, reason: collision with root package name */
        public static final b f10702k5 = new b("UNIVERSE_2024", 304, "universe-2024");
        public static final b l5 = new b("UNIVERSE_2025", 305, "universe-2025");

        /* renamed from: m5, reason: collision with root package name */
        public static final b f10713m5 = new b("UPDATES", 306, "updates");

        /* renamed from: n5, reason: collision with root package name */
        public static final b f10719n5 = new b("UPLOADS", 307, "uploads");
        public static final b o5 = new b("USERBOX", 308, "userbox");

        /* renamed from: p5, reason: collision with root package name */
        public static final b f10728p5 = new b("USERNAME", 309, "username");

        /* renamed from: q5, reason: collision with root package name */
        public static final b f10734q5 = new b("VISUALISATION", 310, "visualisation");

        /* renamed from: r5, reason: collision with root package name */
        public static final b f10740r5 = new b("VISUALIZATION", 311, "visualization");

        /* renamed from: s5, reason: collision with root package name */
        public static final b f10746s5 = new b("W", 312, "w");

        /* renamed from: t5, reason: collision with root package name */
        public static final b f10753t5 = new b("WAITLIST", 313, "waitlist");

        /* renamed from: u5, reason: collision with root package name */
        public static final b f10760u5 = new b("WEB_HOOKS", 314, "web_hooks");

        /* renamed from: v5, reason: collision with root package name */
        public static final b f10766v5 = new b("WEBCASTS", 315, "webcasts");

        /* renamed from: w5, reason: collision with root package name */
        public static final b f10773w5 = new b("WEBINARS", 316, "webinars");

        /* renamed from: x5, reason: collision with root package name */
        public static final b f10779x5 = new b("WIKI", 317, "wiki");

        /* renamed from: y5, reason: collision with root package name */
        public static final b f10785y5 = new b("WIKI_RAW", 318, "wiki-raw");

        /* renamed from: z5, reason: collision with root package name */
        public static final b f10792z5 = new b("WINDOWS", 319, "windows");
        public static final b A5 = new b("WORKS_WITH", 320, "works-with");
        public static final b B5 = new b("WORLDTOUR", 321, "worldtour");
        public static final b C5 = new b("WWW0", 322, "www0");
        public static final b D5 = new b("WWW1", 323, "www1");
        public static final b E5 = new b("WWW2", 324, "www2");
        public static final b F5 = new b("WWW3", 325, "www3");
        public static final b G5 = new b("WWW4", 326, "www4");
        public static final b H5 = new b("WWW6", 327, "www6");
        public static final b I5 = new b("WWW7", 328, "www7");
        public static final b J5 = new b("WWW5", 329, "www5");
        public static final b K5 = new b("WWW8", 330, "www8");
        public static final b L5 = new b("WWW9", 331, "www9");
        public static final b M5 = new b("NEWSLETTER", 332, "newsletter");
        public static final b N5 = new b("ACCELERATOR", 333, "accelerator");
        public static final b O5 = new b("EDUCATION", 334, "education");
        public static final b P5 = new b("SOCIAL_IMPACT", 335, "social-impact");
        public static final b Q5 = new b("WHY_GITHUB", 336, "why-github");
        public static final b R5 = new b("NEWSROOM", 337, "newsroom");
        public static final b S5 = new b("TRUST_CENTER", 338, "trust-center");
        public static final b T5 = new b("ALL_IN_OPEN_SOURCE", 339, "all-in-open-source");
        public static final b U5 = new b("CONTACT_SALES", 340, "contact-sales");
        public static final b V5 = new b("FREQUENTLY_ASKED_QUESTIONS", 341, "frequently-asked-questions");
        public static final b W5 = new b("GITHUB_AND_VSCODE", 342, "github-and-vscode");
        public static final b X5 = new b("GITHUB_OUTREACH", 343, "github-outreach");
        public static final b Y5 = new b("RENEWALS_HELP", 344, "renewals-help");
        public static final b Z5 = new b("ROADMAP_WEBINAR_SERIES", 345, "roadmap-webinar-series");

        static {
            b[] a10 = a();
            f10643a6 = a10;
            l0.t(a10);
        }

        public b(String str, int i, String str2) {
            this.f10793r = str2;
        }

        public static final /* synthetic */ b[] a() {
            return new b[]{f10741s, f10747t, f10754u, f10761v, f10767w, f10774x, f10780y, f10786z, A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z, f10637a0, f10644b0, f10650c0, f10656d0, f10662e0, f10667f0, f10673g0, f10679h0, f10685i0, f10691j0, f10697k0, f10703l0, f10708m0, f10714n0, f10720o0, f10725p0, f10729q0, f10735r0, f10742s0, f10748t0, f10755u0, f10762v0, f10768w0, f10775x0, f10781y0, f10787z0, A0, B0, C0, D0, E0, F0, G0, H0, I0, J0, K0, L0, M0, N0, O0, P0, Q0, R0, S0, T0, U0, V0, W0, X0, Y0, Z0, f10638a1, f10645b1, f10651c1, f10657d1, f10663e1, f10668f1, f10674g1, f10680h1, f10686i1, f10692j1, f10698k1, f10704l1, f10709m1, f10715n1, f10721o1, f10726p1, f10730q1, f10736r1, f10743s1, f10749t1, f10756u1, f10763v1, f10769w1, f10776x1, f10782y1, f10788z1, A1, B1, C1, D1, E1, F1, G1, H1, I1, J1, K1, L1, M1, N1, O1, P1, Q1, R1, S1, T1, U1, V1, W1, X1, Y1, Z1, f10639a2, f10646b2, f10652c2, f10658d2, f10664e2, f10669f2, f10675g2, f10681h2, f10687i2, f10693j2, f10699k2, f10705l2, f10710m2, f10716n2, f10722o2, f10727p2, f10731q2, f10737r2, s2, f10750t2, f10757u2, f10764v2, f10770w2, x2, y2, f10789z2, A2, B2, C2, D2, E2, F2, G2, H2, I2, J2, K2, L2, M2, N2, O2, P2, Q2, R2, S2, T2, U2, V2, W2, X2, Y2, Z2, f10640a3, f10647b3, f10653c3, f10659d3, f10665e3, f10670f3, f10676g3, f10682h3, f10688i3, f10694j3, f10700k3, f10706l3, f10711m3, f10717n3, f10723o3, p3, f10732q3, f10738r3, f10744s3, f10751t3, f10758u3, f10765v3, f10771w3, f10777x3, f10783y3, f10790z3, A3, B3, C3, D3, E3, F3, G3, H3, I3, J3, K3, L3, M3, N3, O3, P3, Q3, R3, S3, T3, U3, V3, W3, X3, Y3, Z3, f10641a4, f10648b4, f10654c4, f10660d4, f10666e4, f10671f4, f10677g4, f10683h4, f10689i4, f10695j4, f10701k4, f10707l4, f10712m4, f10718n4, f10724o4, p4, f10733q4, f10739r4, f10745s4, f10752t4, f10759u4, v4, f10772w4, f10778x4, f10784y4, f10791z4, A4, B4, C4, D4, E4, F4, G4, H4, I4, J4, K4, L4, M4, N4, O4, P4, Q4, R4, S4, T4, U4, V4, W4, X4, Y4, Z4, f10642a5, f10649b5, f10655c5, f10661d5, e5, f10672f5, f10678g5, f10684h5, f10690i5, f10696j5, f10702k5, l5, f10713m5, f10719n5, o5, f10728p5, f10734q5, f10740r5, f10746s5, f10753t5, f10760u5, f10766v5, f10773w5, f10779x5, f10785y5, f10792z5, A5, B5, C5, D5, E5, F5, G5, H5, I5, J5, K5, L5, M5, N5, O5, P5, Q5, R5, S5, T5, U5, V5, W5, X5, Y5, Z5};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f10643a6.clone();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static b a(Uri uri) {
        k.g(uri, "uri");
        List<String> pathSegments = uri.getPathSegments();
        k.f(pathSegments, "getPathSegments(...)");
        String str = (String) m.W(pathSegments);
        if (str == null) {
            return null;
        }
        int hashCode = str.hashCode();
        switch (hashCode) {
            case -2108114528:
                if (str.equals("organizations")) {
                    return b.f10694j3;
                }
                return null;
            case -2104504045:
                if (str.equals("resources-library")) {
                    return b.M3;
                }
                return null;
            case -2095811475:
                if (str.equals("anonymous")) {
                    return b.C;
                }
                return null;
            case -2076650431:
                if (str.equals("timeline")) {
                    return b.R4;
                }
                return null;
            case -2023617739:
                if (str.equals("popularity")) {
                    return b.f10758u3;
                }
                return null;
            case -2015981861:
                if (str.equals("investors")) {
                    return b.f10652c2;
                }
                return null;
            case -2007913718:
                if (str.equals("github-and-vscode")) {
                    return b.W5;
                }
                return null;
            case -1993016416:
                if (str.equals("baitshop")) {
                    return b.L;
                }
                return null;
            case -1983070683:
                if (str.equals("resources")) {
                    return b.L3;
                }
                return null;
            case -1936784192:
                if (str.equals("actions-beta")) {
                    return b.f10754u;
                }
                return null;
            case -1918836409:
                if (str.equals("submodules")) {
                    return b.f10772w4;
                }
                return null;
            case -1900190106:
                if (str.equals("showcases")) {
                    return b.f10641a4;
                }
                return null;
            case -1899952594:
                if (str.equals("repository_cards")) {
                    return b.J3;
                }
                return null;
            case -1897323381:
                if (str.equals("mona-sans")) {
                    return b.P2;
                }
                return null;
            case -1897187073:
                if (str.equals("starred")) {
                    return b.f10718n4;
                }
                return null;
            case -1887957850:
                if (str.equals("editors")) {
                    return b.f10638a1;
                }
                return null;
            case -1884274053:
                if (str.equals("storage")) {
                    return b.f10745s4;
                }
                return null;
            case -1884266413:
                if (str.equals("stories")) {
                    return b.f10759u4;
                }
                return null;
            case -1863356540:
                if (str.equals("suggest")) {
                    return b.f10791z4;
                }
                return null;
            case -1854767153:
                if (str.equals("support")) {
                    return b.C4;
                }
                return null;
            case -1836117863:
                if (str.equals("sponsors")) {
                    return b.f10695j4;
                }
                return null;
            case -1822967846:
                if (str.equals("recommendations")) {
                    return b.E3;
                }
                return null;
            case -1813179994:
                if (str.equals("frequently-asked-questions")) {
                    return b.V5;
                }
                return null;
            case -1770314476:
                if (str.equals("game-off")) {
                    return b.f10763v1;
                }
                return null;
            case -1741312354:
                if (str.equals("collection")) {
                    return b.f10714n0;
                }
                return null;
            case -1700851198:
                if (str.equals("all-in-open-source")) {
                    return b.T5;
                }
                return null;
            case -1684068217:
                if (str.equals("designs-system")) {
                    return b.K0;
                }
                return null;
            case -1677217583:
                if (str.equals("teachers")) {
                    return b.H4;
                }
                return null;
            case -1677213875:
                if (str.equals("teaching")) {
                    return b.I4;
                }
                return null;
            case -1644098620:
                if (str.equals("security-advisories")) {
                    return b.U3;
                }
                return null;
            case -1621485976:
                if (str.equals("octodex")) {
                    return b.f10653c3;
                }
                return null;
            case -1618516182:
                if (str.equals("identicons")) {
                    return b.T1;
                }
                return null;
            case -1598539174:
                if (str.equals("interfaces")) {
                    return b.f10639a2;
                }
                return null;
            case -1548246641:
                if (str.equals("github-outreach")) {
                    return b.X5;
                }
                return null;
            case -1546299383:
                if (str.equals("mentioned")) {
                    return b.F2;
                }
                return null;
            case -1525319953:
                if (str.equals("suggestions")) {
                    return b.B4;
                }
                return null;
            case -1517734770:
                if (str.equals("libgit2-ci")) {
                    return b.f10727p2;
                }
                return null;
            case -1483183075:
                if (str.equals("dependency-insights")) {
                    return b.F0;
                }
                return null;
            case -1475025666:
                if (str.equals("open-source")) {
                    return b.f10670f3;
                }
                return null;
            case -1440404160:
                if (str.equals("buildingthefuture")) {
                    return b.S;
                }
                return null;
            case -1439577118:
                if (str.equals("teacher")) {
                    return b.G4;
                }
                return null;
            case -1427544036:
                if (str.equals("tenderp")) {
                    return b.M4;
                }
                return null;
            case -1427169154:
                if (str.equals("pull_requests")) {
                    return b.B3;
                }
                return null;
            case -1426110178:
                if (str.equals("design-system")) {
                    return b.I0;
                }
                return null;
            case -1422498253:
                if (str.equals("addons")) {
                    return b.f10774x;
                }
                return null;
            case -1419464905:
                if (str.equals("journal")) {
                    return b.f10669f2;
                }
                return null;
            case -1412832805:
                if (str.equals("companies")) {
                    return b.f10742s0;
                }
                return null;
            case -1408207997:
                if (str.equals("assets")) {
                    return b.H;
                }
                return null;
            case -1383204693:
                if (str.equals("bounty")) {
                    return b.P;
                }
                return null;
            case -1355090744:
                if (str.equals("codeql")) {
                    return b.f10691j0;
                }
                return null;
            case -1335246402:
                if (str.equals("design")) {
                    return b.G0;
                }
                return null;
            case -1309148525:
                if (str.equals("explore")) {
                    return b.f10709m1;
                }
                return null;
            case -1307827859:
                if (str.equals("editor")) {
                    return b.Z0;
                }
                return null;
            case -1297352789:
                if (str.equals("g1thub")) {
                    return b.f10756u1;
                }
                return null;
            case -1291329255:
                if (str.equals("events")) {
                    return b.f10698k1;
                }
                return null;
            case -1286625405:
                if (str.equals("discussion_messages")) {
                    return b.T0;
                }
                return null;
            case -1268780831:
                if (str.equals("forked")) {
                    return b.f10743s1;
                }
                return null;
            case -1255199622:
                if (str.equals("jump-to")) {
                    return b.f10681h2;
                }
                return null;
            case -1253090521:
                if (str.equals("garage")) {
                    return b.f10776x1;
                }
                return null;
            case -1245632217:
                if (str.equals("gitlfs")) {
                    return b.I1;
                }
                return null;
            case -1242865050:
                if (str.equals("glthub")) {
                    return b.J1;
                }
                return null;
            case -1237882651:
                if (str.equals("graphs")) {
                    return b.K1;
                }
                return null;
            case -1234885385:
                if (str.equals("guides")) {
                    return b.M1;
                }
                return null;
            case -1225497630:
                if (str.equals("translations")) {
                    return b.Y4;
                }
                return null;
            case -1213015889:
                if (str.equals("milestones_next")) {
                    return b.L2;
                }
                return null;
            case -1198619509:
                if (str.equals("wiki-raw")) {
                    return b.f10785y5;
                }
                return null;
            case -1185250696:
                if (str.equals("images")) {
                    return b.V1;
                }
                return null;
            case -1177318867:
                if (str.equals("account")) {
                    return b.f10747t;
                }
                return null;
            case -1146830912:
                if (str.equals("business")) {
                    return b.T;
                }
                return null;
            case -1109843021:
                if (str.equals("launch")) {
                    return b.f10705l2;
                }
                return null;
            case -1083022899:
                if (str.equals("gist-assets")) {
                    return b.C1;
                }
                return null;
            case -1082823661:
                if (str.equals("slowtown")) {
                    return b.f10660d4;
                }
                return null;
            case -1080340982:
                if (str.equals("public_keys")) {
                    return b.A3;
                }
                return null;
            case -1073380545:
                if (str.equals("the-website")) {
                    return b.O4;
                }
                return null;
            case -1068855134:
                if (str.equals("mobile")) {
                    return b.O2;
                }
                return null;
            case -1053738980:
                if (str.equals("journals")) {
                    return b.f10675g2;
                }
                return null;
            case -1047860588:
                if (str.equals("dashboard")) {
                    return b.C0;
                }
                return null;
            case -1043863346:
                if (str.equals("callbacks")) {
                    return b.X;
                }
                return null;
            case -1020511286:
                if (str.equals("oembed")) {
                    return b.f10659d3;
                }
                return null;
            case -1003854816:
                if (str.equals("owners")) {
                    return b.f10700k3;
                }
                return null;
            case -998696838:
                if (str.equals("projects")) {
                    return b.f10790z3;
                }
                return null;
            case -994287078:
                if (str.equals("solutions")) {
                    return b.f10666e4;
                }
                return null;
            case -991113336:
                if (str.equals("shareholders")) {
                    return b.Y3;
                }
                return null;
            case -949488047:
                if (str.equals("design-blog")) {
                    return b.H0;
                }
                return null;
            case -948958964:
                if (str.equals("design-team")) {
                    return b.J0;
                }
                return null;
            case -934979154:
                if (str.equals("readme")) {
                    return b.D3;
                }
                return null;
            case -934889060:
                if (str.equals("redeem")) {
                    return b.F3;
                }
                return null;
            case -934592106:
                if (str.equals("render")) {
                    return b.G3;
                }
                return null;
            case -934352412:
                if (str.equals("revert")) {
                    return b.O3;
                }
                return null;
            case -906336856:
                if (str.equals("search")) {
                    return b.S3;
                }
                return null;
            case -902467678:
                if (str.equals("signin")) {
                    return b.f10648b4;
                }
                return null;
            case -892481938:
                if (str.equals("static")) {
                    return b.p4;
                }
                return null;
            case -892481550:
                if (str.equals("status")) {
                    return b.f10733q4;
                }
                return null;
            case -878183505:
                if (str.equals("non-profits")) {
                    return b.U2;
                }
                return null;
            case -875559580:
                if (str.equals("customer-stories")) {
                    return b.A0;
                }
                return null;
            case -868034268:
                if (str.equals("topics")) {
                    return b.T4;
                }
                return null;
            case -867257261:
                if (str.equals("codeload")) {
                    return b.f10685i0;
                }
                return null;
            case -852085848:
                if (str.equals("migrating")) {
                    return b.J2;
                }
                return null;
            case -845160140:
                if (str.equals("advisorydatabase")) {
                    return b.A;
                }
                return null;
            case -821723443:
                if (str.equals("error_pages")) {
                    return b.f10692j1;
                }
                return null;
            case -808251643:
                if (str.equals("web_hooks")) {
                    return b.f10760u5;
                }
                return null;
            case -802737311:
                if (str.equals("enterprise")) {
                    return b.f10657d1;
                }
                return null;
            case -801499745:
                if (str.equals("survey-responses")) {
                    return b.D4;
                }
                return null;
            case -797764629:
                if (str.equals("roadmap-webinar-series")) {
                    return b.Z5;
                }
                return null;
            case -779448510:
                if (str.equals("nonprofits")) {
                    return b.X2;
                }
                return null;
            case -746555769:
                if (str.equals("earlyaccess")) {
                    return b.X0;
                }
                return null;
            case -715319744:
                if (str.equals("webcasts")) {
                    return b.f10766v5;
                }
                return null;
            case -709408695:
                if (str.equals("webinars")) {
                    return b.f10773w5;
                }
                return null;
            case -690636360:
                if (str.equals("mentioning")) {
                    return b.G2;
                }
                return null;
            case -682046913:
                if (str.equals("github-design-systems")) {
                    return b.G1;
                }
                return null;
            case -666507060:
                if (str.equals("designs-systems")) {
                    return b.L0;
                }
                return null;
            case -648629523:
                if (str.equals("collector-cdn")) {
                    return b.f10725p0;
                }
                return null;
            case -648601833:
                if (str.equals("advisories")) {
                    return b.f10767w;
                }
                return null;
            case -648586505:
                if (str.equals("advisorydb")) {
                    return b.B;
                }
                return null;
            case -644524870:
                if (str.equals("certification")) {
                    return b.f10650c0;
                }
                return null;
            case -635082182:
                if (str.equals("avatars")) {
                    return b.K;
                }
                return null;
            case -604069943:
                if (str.equals("mentions")) {
                    return b.H2;
                }
                return null;
            case -602415628:
                if (str.equals("comments")) {
                    return b.f10729q0;
                }
                return null;
            case -547092943:
                if (str.equals("cookbook")) {
                    return b.f10768w0;
                }
                return null;
            case -544209625:
                if (str.equals("enterprise-docs")) {
                    return b.f10668f1;
                }
                return null;
            case -475629664:
                if (str.equals("plugins")) {
                    return b.f10744s3;
                }
                return null;
            case -471865057:
                if (str.equals("contact-sales")) {
                    return b.U5;
                }
                return null;
            case -462094004:
                if (str.equals("messages")) {
                    return b.I2;
                }
                return null;
            case -442996344:
                if (str.equals("why-github")) {
                    return b.Q5;
                }
                return null;
            case -414977423:
                if (str.equals("scraping")) {
                    return b.R3;
                }
                return null;
            case -393940263:
                if (str.equals("popular")) {
                    return b.f10751t3;
                }
                return null;
            case -377141366:
                if (str.equals("fixtures")) {
                    return b.f10736r1;
                }
                return null;
            case -315056186:
                if (str.equals("pricing")) {
                    return b.f10777x3;
                }
                return null;
            case -290756696:
                if (str.equals("education")) {
                    return b.O5;
                }
                return null;
            case -290659282:
                if (str.equals("featured")) {
                    return b.f10715n1;
                }
                return null;
            case -290659267:
                if (str.equals("features")) {
                    return b.f10721o1;
                }
                return null;
            case -265713450:
                if (str.equals("username")) {
                    return b.f10728p5;
                }
                return null;
            case -234430262:
                if (str.equals("updates")) {
                    return b.f10713m5;
                }
                return null;
            case -226643310:
                if (str.equals("uploads")) {
                    return b.f10719n5;
                }
                return null;
            case -195591107:
                if (str.equals("gameoff")) {
                    return b.f10769w1;
                }
                return null;
            case -147129824:
                if (str.equals("userbox")) {
                    return b.o5;
                }
                return null;
            case -135761730:
                if (str.equals("identity")) {
                    return b.U1;
                }
                return null;
            case -109829509:
                if (str.equals("billing")) {
                    return b.M;
                }
                return null;
            case -96081123:
                if (str.equals("difftool")) {
                    return b.R0;
                }
                return null;
            case -94864709:
                if (str.equals("help-wanted")) {
                    return b.P1;
                }
                return null;
            case -86479405:
                if (str.equals("renewals-help")) {
                    return b.Y5;
                }
                return null;
            case -85567126:
                if (str.equals("experience")) {
                    return b.f10704l1;
                }
                return null;
            case -80681014:
                if (str.equals("developer")) {
                    return b.N0;
                }
                return null;
            case -47399035:
                if (str.equals("codereview")) {
                    return b.f10697k0;
                }
                return null;
            case -46292327:
                if (str.equals("individual")) {
                    return b.X1;
                }
                return null;
            case -46163919:
                if (str.equals("works-with")) {
                    return b.A5;
                }
                return null;
            case -41653623:
                if (str.equals("layouts")) {
                    return b.f10710m2;
                }
                return null;
            case -25407024:
                if (str.equals("branches")) {
                    return b.Q;
                }
                return null;
            case -19386923:
                if (str.equals("codesearch")) {
                    return b.f10703l0;
                }
                return null;
            case -9242534:
                if (str.equals("codespaces")) {
                    return b.f10708m0;
                }
                return null;
            case 99:
                if (str.equals("c")) {
                    return b.V;
                }
                return null;
            case 119:
                if (str.equals("w")) {
                    return b.f10746s5;
                }
                return null;
            case 3201:
                if (str.equals("de")) {
                    return b.E0;
                }
                return null;
            case 3276:
                if (str.equals("fr")) {
                    return b.f10749t1;
                }
                return null;
            case 96748:
                if (str.equals("any")) {
                    return b.D;
                }
                return null;
            case 96794:
                if (str.equals("api")) {
                    return b.E;
                }
                return null;
            case 98584:
                if (str.equals("cla")) {
                    return b.f10673g0;
                }
                return null;
            case 100278:
                if (str.equals("edu")) {
                    return b.f10645b1;
                }
                return null;
            case 106893:
                if (str.equals("lab")) {
                    return b.f10687i2;
                }
                return null;
            case 107855:
                if (str.equals("mac")) {
                    return b.f10764v2;
                }
                return null;
            case 107866:
                if (str.equals("man")) {
                    return b.A2;
                }
                return null;
            case 107930:
                if (str.equals("mcp")) {
                    return b.C2;
                }
                return null;
            case 108960:
                if (str.equals("new")) {
                    return b.S2;
                }
                return null;
            case 112680:
                if (str.equals("raw")) {
                    return b.C3;
                }
                return null;
            case 114089:
                if (str.equals("u2f")) {
                    return b.f10649b5;
                }
                return null;
            case 114184:
                if (str.equals("ssh")) {
                    return b.f10701k4;
                }
                return null;
            case 114717:
                if (str.equals("ten")) {
                    return b.L4;
                }
                return null;
            case 115032:
                if (str.equals("tos")) {
                    return b.U4;
                }
                return null;
            case 3000946:
                if (str.equals("apps")) {
                    return b.G;
                }
                return null;
            case 3026845:
                if (str.equals("blob")) {
                    return b.N;
                }
                return null;
            case 3026850:
                if (str.equals("blog")) {
                    return b.O;
                }
                return null;
            case 3046016:
                if (str.equals("camo")) {
                    return b.Y;
                }
                return null;
            case 3052376:
                if (str.equals("chat")) {
                    return b.f10667f0;
                }
                return null;
            case 3083269:
                if (str.equals("diff")) {
                    return b.Q0;
                }
                return null;
            case 3173059:
                if (str.equals("gist")) {
                    return b.B1;
                }
                return null;
            case 3194941:
                if (str.equals("halp")) {
                    return b.N1;
                }
                return null;
            case 3198785:
                if (str.equals("help")) {
                    return b.O1;
                }
                return null;
            case 3208415:
                if (str.equals("home")) {
                    return b.Q1;
                }
                return null;
            case 3237038:
                if (str.equals("info")) {
                    return b.Y1;
                }
                return null;
            case 3267670:
                if (str.equals("jobs")) {
                    return b.f10664e2;
                }
                return null;
            case 3313798:
                if (str.equals("labs")) {
                    return b.f10693j2;
                }
                return null;
            case 3351635:
                if (str.equals("mine")) {
                    return b.M2;
                }
                return null;
            case 3377875:
                if (str.equals("news")) {
                    return b.T2;
                }
                return null;
            case 3387192:
                if (str.equals("none")) {
                    return b.V2;
                }
                return null;
            case 3433103:
                if (str.equals("page")) {
                    return b.f10711m3;
                }
                return null;
            case 3529462:
                if (str.equals("shop")) {
                    return b.Z3;
                }
                return null;
            case 3530567:
                if (str.equals("site")) {
                    return b.f10654c4;
                }
                return null;
            case 3536713:
                if (str.equals("spam")) {
                    return b.f10671f4;
                }
                return null;
            case 3541613:
                if (str.equals("sudo")) {
                    return b.f10784y4;
                }
                return null;
            case 3555933:
                if (str.equals("team")) {
                    return b.J4;
                }
                return null;
            case 3566168:
                if (str.equals("tour")) {
                    return b.V4;
                }
                return null;
            case 3568542:
                if (str.equals("tree")) {
                    return b.Z4;
                }
                return null;
            case 3649456:
                if (str.equals("wiki")) {
                    return b.f10779x5;
                }
                return null;
            case 65035134:
                if (str.equals("openscripts")) {
                    return b.f10676g3;
                }
                return null;
            case 92611469:
                if (str.equals("about")) {
                    return b.f10741s;
                }
                return null;
            case 92668751:
                if (str.equals("admin")) {
                    return b.f10761v;
                }
                return null;
            case 93997959:
                if (str.equals("brand")) {
                    return b.R;
                }
                return null;
            case 94416770:
                if (str.equals("cache")) {
                    return b.W;
                }
                return null;
            case 94756405:
                if (str.equals("cloud")) {
                    return b.f10679h0;
                }
                return null;
            case 94980860:
                if (str.equals("ctags")) {
                    return b.f10781y0;
                }
                return null;
            case 96619420:
                if (str.equals("email")) {
                    return b.f10651c1;
                }
                return null;
            case 97434231:
                if (str.equals("files")) {
                    return b.f10730q1;
                }
                return null;
            case 98364944:
                if (str.equals("gists")) {
                    return b.E1;
                }
                return null;
            case 98712316:
                if (str.equals("guide")) {
                    return b.L1;
                }
                return null;
            case 99463088:
                if (str.equals("hooks")) {
                    return b.R1;
                }
                return null;
            case 100344454:
                if (str.equals("inbox")) {
                    return b.W1;
                }
                return null;
            case 102846020:
                if (str.equals("learn")) {
                    return b.f10716n2;
                }
                return null;
            case 102851257:
                if (str.equals("legal")) {
                    return b.f10722o2;
                }
                return null;
            case 102977780:
                if (str.equals("linux")) {
                    return b.f10737r2;
                }
                return null;
            case 102982549:
                if (str.equals("lists")) {
                    return b.f10750t2;
                }
                return null;
            case 103149608:
                if (str.equals("logos")) {
                    return b.f10757u2;
                }
                return null;
            case 103772132:
                if (str.equals("media")) {
                    return b.D2;
                }
                return null;
            case 105650780:
                if (str.equals("offer")) {
                    return b.f10665e3;
                }
                return null;
            case 106426308:
                if (str.equals("pages")) {
                    return b.f10717n3;
                }
                return null;
            case 106748522:
                if (str.equals("plans")) {
                    return b.f10738r3;
                }
                return null;
            case 106855379:
                if (str.equals("posts")) {
                    return b.f10765v3;
                }
                return null;
            case 106931267:
                if (str.equals("press")) {
                    return b.f10771w3;
                }
                return null;
            case 108401386:
                if (str.equals("reply")) {
                    return b.H3;
                }
                return null;
            case 109211271:
                if (str.equals("saved")) {
                    return b.Q3;
                }
                return null;
            case 109638365:
                if (str.equals("spark")) {
                    return b.f10677g4;
                }
                return null;
            case 109757152:
                if (str.equals("staff")) {
                    return b.f10707l4;
                }
                return null;
            case 109757537:
                if (str.equals("stars")) {
                    return b.f10724o4;
                }
                return null;
            case 109770977:
                if (str.equals("store")) {
                    return b.f10752t4;
                }
                return null;
            case 110125383:
                if (str.equals("talks")) {
                    return b.E4;
                }
                return null;
            case 110233717:
                if (str.equals("teach")) {
                    return b.F4;
                }
                return null;
            case 110234038:
                if (str.equals("teams")) {
                    return b.K4;
                }
                return null;
            case 110250375:
                if (str.equals("terms")) {
                    return b.N4;
                }
                return null;
            case 110546223:
                if (str.equals("topic")) {
                    return b.S4;
                }
                return null;
            case 110621192:
                if (str.equals("train")) {
                    return b.W4;
                }
                return null;
            case 147522539:
                if (str.equals("styleguide")) {
                    return b.v4;
                }
                return null;
            case 166208699:
                if (str.equals("library")) {
                    return b.f10731q2;
                }
                return null;
            case 246054803:
                if (str.equals("waitlist")) {
                    return b.f10753t5;
                }
                return null;
            case 269294297:
                if (str.equals("organisations")) {
                    return b.f10688i3;
                }
                return null;
            case 273184745:
                if (str.equals("discover")) {
                    return b.S0;
                }
                return null;
            case 280154875:
                if (str.equals("stafftools")) {
                    return b.f10712m4;
                }
                return null;
            case 300911179:
                if (str.equals("marketplace")) {
                    return b.B2;
                }
                return null;
            case 308369609:
                if (str.equals("enterprise-cloud")) {
                    return b.f10663e1;
                }
                return null;
            case 316464461:
                if (str.equals("enterprise-legal")) {
                    return b.f10674g1;
                }
                return null;
            case 317649683:
                if (str.equals("maintenance")) {
                    return b.y2;
                }
                return null;
            case 389792390:
                if (str.equals("github_spark_waitlist_signup")) {
                    return b.H1;
                }
                return null;
            case 390770123:
                if (str.equals("oauth_applications")) {
                    return b.f10640a3;
                }
                return null;
            case 400074090:
                if (str.equals("trust-center")) {
                    return b.S5;
                }
                return null;
            case 405645655:
                if (str.equals("attributes")) {
                    return b.J;
                }
                return null;
            case 440651083:
                if (str.equals("discussions")) {
                    return b.U0;
                }
                return null;
            case 443164224:
                if (str.equals("personal")) {
                    return b.f10732q3;
                }
                return null;
            case 498378955:
                if (str.equals("visualisation")) {
                    return b.f10734q5;
                }
                return null;
            case 553969845:
                if (str.equals("careers")) {
                    return b.Z;
                }
                return null;
            case 605242644:
                if (str.equals("generated_pages")) {
                    return b.f10782y1;
                }
                return null;
            case 605658493:
                if (str.equals("edit_repositories")) {
                    return b.Y0;
                }
                return null;
            case 606175198:
                if (str.equals("customer")) {
                    return b.f10787z0;
                }
                return null;
            case 665251189:
                if (str.equals("central")) {
                    return b.f10644b0;
                }
                return null;
            case 698783012:
                if (str.equals("visualization")) {
                    return b.f10740r5;
                }
                return null;
            case 750867693:
                if (str.equals("packages")) {
                    return b.f10706l3;
                }
                return null;
            case 830968911:
                if (str.equals("mailers")) {
                    return b.x2;
                }
                return null;
            case 834063317:
                if (str.equals("malware")) {
                    return b.f10789z2;
                }
                return null;
            case 837086986:
                if (str.equals("thewebsite")) {
                    return b.Q4;
                }
                return null;
            case 875077159:
                if (str.equals("professional")) {
                    return b.f10783y3;
                }
                return null;
            case 884947250:
                if (str.equals("enterprises")) {
                    return b.f10686i1;
                }
                return null;
            case 949122880:
                if (str.equals("security")) {
                    return b.T3;
                }
                return null;
            case 950345194:
                if (str.equals("mention")) {
                    return b.E2;
                }
                return null;
            case 950402588:
                if (str.equals("commits")) {
                    return b.f10735r0;
                }
                return null;
            case 950484197:
                if (str.equals("compare")) {
                    return b.f10748t0;
                }
                return null;
            case 951526432:
                if (str.equals("contact")) {
                    return b.f10755u0;
                }
                return null;
            case 957885709:
                if (str.equals("coupons")) {
                    return b.f10775x0;
                }
                return null;
            case 961208939:
                if (str.equals("accelerator")) {
                    return b.N5;
                }
                return null;
            case 1068502164:
                if (str.equals("mirrors")) {
                    return b.N2;
                }
                return null;
            case 1083235153:
                if (str.equals("nonprofit")) {
                    return b.W2;
                }
                return null;
            case 1097519758:
                if (str.equals("restore")) {
                    return b.N3;
                }
                return null;
            case 1098703162:
                if (str.equals("hosting")) {
                    return b.S1;
                }
                return null;
            case 1100107441:
                if (str.equals("thecream")) {
                    return b.P4;
                }
                return null;
            case 1102578873:
                if (str.equals("newsletter")) {
                    return b.M5;
                }
                return null;
            case 1109445082:
                if (str.equals("geocities")) {
                    return b.f10788z1;
                }
                return null;
            case 1119718118:
                if (str.equals("devtools")) {
                    return b.P0;
                }
                return null;
            case 1120733128:
                if (str.equals("security-research-lab")) {
                    return b.V3;
                }
                return null;
            case 1123773674:
                if (str.equals("worldtour")) {
                    return b.B5;
                }
                return null;
            case 1124085178:
                if (str.equals("apple-app-site-association")) {
                    return b.F;
                }
                return null;
            case 1156347348:
                if (str.equals("integration")) {
                    return b.Z1;
                }
                return null;
            case 1189002411:
                if (str.equals("partners")) {
                    return b.f10723o3;
                }
                return null;
            case 1197425773:
                if (str.equals("spider-skull-island")) {
                    return b.f10689i4;
                }
                return null;
            case 1197722116:
                if (str.equals("suggestion")) {
                    return b.A4;
                }
                return null;
            case 1211747238:
                if (str.equals("social-impact")) {
                    return b.P5;
                }
                return null;
            case 1220378142:
                if (str.equals("gist-raw")) {
                    return b.D1;
                }
                return null;
            case 1260203749:
                if (str.equals("opensource")) {
                    return b.f10682h3;
                }
                return null;
            case 1267980794:
                if (str.equals("octicons")) {
                    return b.f10647b3;
                }
                return null;
            case 1272354024:
                if (str.equals("notifications")) {
                    return b.Z2;
                }
                return null;
            case 1276119258:
                if (str.equals("training")) {
                    return b.X4;
                }
                return null;
            case 1296516636:
                if (str.equals("categories")) {
                    return b.f10637a0;
                }
                return null;
            case 1312704747:
                if (str.equals("downloads")) {
                    return b.V0;
                }
                return null;
            case 1318692896:
                if (str.equals("statuses")) {
                    return b.f10739r4;
                }
                return null;
            case 1342117123:
                if (str.equals("milestones")) {
                    return b.K2;
                }
                return null;
            case 1346279023:
                if (str.equals("listings")) {
                    return b.s2;
                }
                return null;
            case 1349493379:
                if (str.equals("windows")) {
                    return b.f10792z5;
                }
                return null;
            case 1366708796:
                if (str.equals("roadmap")) {
                    return b.P3;
                }
                return null;
            case 1368602130:
                if (str.equals("advisory-db")) {
                    return b.f10786z;
                }
                return null;
            case 1375970282:
                if (str.equals("contributing")) {
                    return b.f10762v0;
                }
                return null;
            case 1379209310:
                if (str.equals("services")) {
                    return b.W3;
                }
                return null;
            case 1382682413:
                if (str.equals("payments")) {
                    return b.p3;
                }
                return null;
            case 1394955557:
                if (str.equals("trending")) {
                    return b.f10642a5;
                }
                return null;
            case 1395747374:
                if (str.equals("newsroom")) {
                    return b.R5;
                }
                return null;
            case 1404814876:
                if (str.equals("github-apps")) {
                    return b.F1;
                }
                return null;
            case 1421215535:
                if (str.equals("enterprise-server")) {
                    return b.f10680h1;
                }
                return null;
            case 1428051567:
                if (str.equals("downtime")) {
                    return b.W0;
                }
                return null;
            case 1434631203:
                if (str.equals("settings")) {
                    return b.X3;
                }
                return null;
            case 1443555064:
                if (str.equals("getting-started")) {
                    return b.A1;
                }
                return null;
            case 1455272340:
                if (str.equals("changelog")) {
                    return b.f10662e0;
                }
                return null;
            case 1494565625:
                if (str.equals("certifications")) {
                    return b.f10656d0;
                }
                return null;
            case 1518327835:
                if (str.equals("languages")) {
                    return b.f10699k2;
                }
                return null;
            case 1537130832:
                if (str.equals("developer-stories")) {
                    return b.O0;
                }
                return null;
            case 1539594266:
                if (str.equals("introduction")) {
                    return b.f10646b2;
                }
                return null;
            case 1559690845:
                if (str.equals("develop")) {
                    return b.M0;
                }
                return null;
            case 1563907238:
                if (str.equals("javascripts")) {
                    return b.f10658d2;
                }
                return null;
            case 1611562069:
                if (str.equals("customers")) {
                    return b.B0;
                }
                return null;
            case 1692278845:
                if (str.equals("repository_search")) {
                    return b.K3;
                }
                return null;
            case 1702091886:
                if (str.equals("businesses")) {
                    return b.U;
                }
                return null;
            case 1768511039:
                if (str.equals("file-servers")) {
                    return b.f10726p1;
                }
                return null;
            case 1792078497:
                if (str.equals("machine-room")) {
                    return b.f10770w2;
                }
                return null;
            case 1843485230:
                if (str.equals("network")) {
                    return b.R2;
                }
                return null;
            case 1853891989:
                if (str.equals("collections")) {
                    return b.f10720o0;
                }
                return null;
            case 1862666772:
                if (str.equals("navigation")) {
                    return b.Q2;
                }
                return null;
            case 1876060255:
                if (str.equals("dashboards")) {
                    return b.D0;
                }
                return null;
            case 1987365622:
                if (str.equals("subscriptions")) {
                    return b.f10778x4;
                }
                return null;
            case 1989393423:
                if (str.equals("advisory-database")) {
                    return b.f10780y;
                }
                return null;
            case 2057179726:
                if (str.equals("spamurai")) {
                    return b.f10683h4;
                }
                return null;
            case 2113732968:
                if (str.equals("repositories")) {
                    return b.I3;
                }
                return null;
            case 2129347739:
                if (str.equals("notices")) {
                    return b.Y2;
                }
                return null;
            case 2146103011:
                if (str.equals("assets-cdn")) {
                    return b.I;
                }
                return null;
            default:
                switch (hashCode) {
                    case 3663225:
                        if (str.equals("www0")) {
                            return b.C5;
                        }
                        return null;
                    case 3663226:
                        if (str.equals("www1")) {
                            return b.D5;
                        }
                        return null;
                    case 3663227:
                        if (str.equals("www2")) {
                            return b.E5;
                        }
                        return null;
                    case 3663228:
                        if (str.equals("www3")) {
                            return b.F5;
                        }
                        return null;
                    case 3663229:
                        if (str.equals("www4")) {
                            return b.G5;
                        }
                        return null;
                    case 3663230:
                        if (str.equals("www5")) {
                            return b.J5;
                        }
                        return null;
                    case 3663231:
                        if (str.equals("www6")) {
                            return b.H5;
                        }
                        return null;
                    case 3663232:
                        if (str.equals("www7")) {
                            return b.I5;
                        }
                        return null;
                    case 3663233:
                        if (str.equals("www8")) {
                            return b.K5;
                        }
                        return null;
                    case 3663234:
                        if (str.equals("www9")) {
                            return b.L5;
                        }
                        return null;
                    default:
                        switch (hashCode) {
                            case 796651371:
                                if (str.equals("universe-2016")) {
                                    return b.f10655c5;
                                }
                                return null;
                            case 796651372:
                                if (str.equals("universe-2017")) {
                                    return b.f10661d5;
                                }
                                return null;
                            case 796651373:
                                if (str.equals("universe-2018")) {
                                    return b.e5;
                                }
                                return null;
                            case 796651374:
                                if (str.equals("universe-2019")) {
                                    return b.f10672f5;
                                }
                                return null;
                            default:
                                switch (hashCode) {
                                    case 796651396:
                                        if (str.equals("universe-2020")) {
                                            return b.f10678g5;
                                        }
                                        return null;
                                    case 796651397:
                                        if (str.equals("universe-2021")) {
                                            return b.f10684h5;
                                        }
                                        return null;
                                    case 796651398:
                                        if (str.equals("universe-2022")) {
                                            return b.f10690i5;
                                        }
                                        return null;
                                    case 796651399:
                                        if (str.equals("universe-2023")) {
                                            return b.f10696j5;
                                        }
                                        return null;
                                    case 796651400:
                                        if (str.equals("universe-2024")) {
                                            return b.f10702k5;
                                        }
                                        return null;
                                    case 796651401:
                                        if (str.equals("universe-2025")) {
                                            return b.l5;
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }
}
