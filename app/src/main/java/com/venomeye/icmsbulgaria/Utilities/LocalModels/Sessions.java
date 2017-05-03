package com.venomeye.icmsbulgaria.Utilities.LocalModels;


import com.orm.SugarRecord;

public class Sessions extends SugarRecord {
    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public String getCategory() {
        return category;
    }


    String author;
    String content;
    String category;

    public Sessions(){
    }

    public Sessions(String author, String content, String category){
        this.author=author;
        this.content=content;
        this.category=category;
    }


    public static void fillDatabaseIfNeeded(){
        if(Sessions.count(Sessions.class)==0){
            //Sessions
//Sessions
            Sessions session = new Sessions(
                    "ADAM CHMIELOWSKI",
                    "HYPOTENSIVE DRUGS INFLUENCES MACROPHAGE PHAGOCYTIC FUNCTIONS AND INDUCTION OF HUMORAL RESPONSE IN MICE",
                    "preclinic"
            );
            session.save();

            session = new Sessions(
                    "ALEKSANDRA BASAJ",
                    "ASSESSMENT OF ALLIC 2009 THERAPEUTIC PROTOCOL EFFECTS ON FREQUENCIES OF ENDOTHELIAL PROGENITOR CELLS IN THE BONE MARROW OF ACUTE LYMPHOBLASTIC LEUKEMIA PEDIATRIC PATIENTS",
                    "preclinic"
            );
            session.save();

            session = new Sessions(
                    "ANIDA ADEMOVIC",
                    "POSTICTAL BEHAVIOR IN EXPERIMENTAL MODEL OF EPILEPSY: EXAMINATION BY ELEVATED PLUS MAZE TEST",
                    "preclinic"
            );
            session.save();

            session = new Sessions(
                    "ANNA KRETOWSKA",
                    "THE IMPACT OF CTLA-4 AND PD-1 INHIBITION ON THE IN VITRO INTERACTIONS OF LYMPHOCYTES WITH MDAMB-231 BREAST CANCER CELLS",
                    "preclinic"
            );
            session.save();

            session = new Sessions(
                    "ANNA PETERKO",
                    "ONLINE SURVEILLANCE SYSTEM PREDICTS RETINOPATHY OF PREMATURITY",
                    "preclinic"
            );
            session.save();

            session = new Sessions(
                    "ANNA PAZIK",
                    "ARE THE CHILDHOOD CANCER SURVIVORS AT RISK OF VITAMIN D DEFICIENCY",
                    "preclinic"
            );
            session.save();

            session = new Sessions(
                    "AYILKIN ÇELIK",
                    "A SURVEY OF THE CONSEQUENCES OF THE SYRIAN CIVIL WAR ON COMMUNICABLE DISEASES",
                    "preclinic"
            );
            session.save();

            session = new Sessions(
                    "BILYANA GEORGIEVA",
                    "DEVELOPMENT OF A BIOCHEMICAL ENZYMATIC AND MOLECULAR-GENETIC APPROACH FOR DIAGNOSTICS OF BIOTINIDASE DEFICIENCY IN BULGARIA",
                    "preclinic"
            );
            session.save();

            session = new Sessions(
                    "BORYANA ATANASOVA",
                    "POSSIBLE MOLECULAR MECHANISM IN ANOVULATION OF PCOS WOMEN",
                    "preclinic"
            );
            session.save();

            session = new Sessions(
                    "DANIEL ADDAI",
                    "VITAMIN D AS A PREVENTION FOR DIABETES",
                    "preclinic"
            );
            session.save();

            session = new Sessions(
                    "DIMO DIMITROV",
                    "A HISTOLOGICAL ANALYSIS OF CHANGES IN THE MORPHOLOGY OF THE KIDNEYS IN SPONTANEOUSLY HYPERTENSIVE RATS",
                    "preclinic"
            );
            session.save();

            session = new Sessions(
                    "ELISABETTA DI BLASI",
                    "THERMOREGULATORY INTERACTIONS BETWEEN LEPTIN AND MODULATORS OF GABAB RECEPTOR FUNCTION IN RATS WITH NORMAL WEIGHT AND EXPERIMENTAL MODEL OF OBESITY",
                    "preclinic"
            );
            session.save();

            session = new Sessions(
                    "ESTYA NADYA MEITAVANY",
                    "CORRELATION BETWEEN THE INCIDENCE RATE OF DENGUE HAEMORRHAGIC FEVER AND CLIMATE FACTORS IN INDONESIA",
                    "preclinic"
            );
            session.save();

            session = new Sessions(
                    "GEORGI KOTOV",
                    "A COMPARATIVE LIGHT MICROSCOPIC ANALYSIS OF CHANGES IN THE MORPHOLOGY OF THE RAT MYOCARDIUM DURING THE POSTNATAL DEVELOPMENT",
                    "preclinic"
            );
            session.save();

            session = new Sessions(
                    "IVAN TSONEV",
                    "APPLICATION OF NON-THERMAL MICROWAVE PLASMA ON WOUND REGENERATION",
                    "preclinic"
            );
            session.save();

            session = new Sessions(
                    "IVAN RAJKOVIC",
                    "THE EXAMINATION OF THE CLINICAL AND PATHOHISTOLOGICAL CHARACTERISTICS OF THE COLORECTAL CARCINOMA IN THE SOUTHEASTERN SERBIA",
                    "preclinic"
            );
            session.save();

            session = new Sessions(
                    "KATARZYNA CHLOPAS",
                    "MIXED SUPRAMOLECULAR LIGANDS AS MARKERS FOR AMYLOIDS IN ELECTRON MICROSCOPY",
                    "preclinic"
            );
            session.save();

            session = new Sessions(
                    "LUSINE HOVHANNISYAN",
                    "ALTERED SOCIAL BEHAVIOR IN BRAIN TUMOR RATS MODEL",
                    "preclinic"
            );
            session.save();

            session = new Sessions(
                    "MANUSHAK AVAGYAN ",
                    "ESTABLISHMENT OF PATINENT DERIVED TUMOR XENOGRAFT IN NEONATAL RATS",
                    "preclinic"
            );
            session.save();

            session = new Sessions(
                    "MARIA DINKOVA",
                    "NEUROPEPTIDE TRAITS IN THE RAT CAROTID BODY",
                    "preclinic"
            );
            session.save();

            session = new Sessions(
                    "MARTIN SHAHID",
                    "IMMUNE SEROLOGIC STUDIES IN PATIENTS WITH DERMATITIS HERPETIFORMIS: ENDOMYSIUM, TISSUE TRANSGLUTAMINASE, AND DEAMIDATED GLIADIN-DERIVED PEPTIDE CIRCULATING ANTIBODIES",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "MARTINA CHOVANCOVA",
                    "THE IMMUNOTOXICITY OF TITANIUM DIOXIDE NANOPARTICLES",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "MICHAEL JONATAN",
                    "INFLUENCE OF NIGHT SHIFT CLINICAL ROTATION TOWARDS DIURNAL VARIATION OF BLOOD PRESSURE OF THE CLINICAL CLERKS COMPARED WITH PRECLINICAL STUDENTS",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "MILENA OSINSKA",
                    "IS THE TREATMENT FOR CHILDHOOD CANCER AFFECTS ON VITAMIN D STATUS DURING INTENSIVE CHEMOTHERAPY?",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "NEVENA FILEVA",
                    "INITIAL EXPERIENCE WITH 3T MAGNETIC RESONANCE IMAGING IN PATIENTS WITH DEMYELINATING DISEASE",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "OGNIAN MOSKOV",
                    "IINFLUENCE OF THE WATER EXTRACTS OF PROPOLIS ON DIFFERENT CELL CULTURES WITH THE MTT ASSAY",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "PAOLETA YORDANOVA",
                    "CHANGES IN CAPILLARY DENSITY IN THE MYOCARDIUM OF NORMOTENSIVE AND SPONTANEOUSLY HYPERTENSIVE RATS",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "SARA MILOVANOVIC",
                    "MICROSCOPIC PICTURES OF HUMAN DENTATE NUCLEUS BORDER NEURONS: PARAMETERS OF NONLINEAR QUANTITATIVE ANALYSIS AND EXAMINATION OF AGE DISTRIBUTION",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "SHALVA LEKIASHVILI",
                    "TYPES OF THE PATHOLOGICAL THYROID GLAND ATPASES AND THEIR KINETIC PARAMETERS",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "LAZAR MITROV",
                    "INVOLVEMENT OF ADENOSINE, ACTING BY ADENOSINE A1 RECEPTOR SUBTYPE, AND NEURONAL NITRIC OXIDE SYNTHASE IN THE RENAL BLOOD FLOW AUTOREGULATION IN RATS",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "SHENOL CHAKAR",
                    "EVALUATION OF MEDIAN EFFECTIVE DOSES (ED50), MEDIAN TOXIC DOSES (TD50) AND PROTECTIVE INDICES (PI) OF SIX NEWLY SYNTHESIZED ANTICONVULSANTS ",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "SRIRAM HARIHARAN",
                    "PROGNOSTIC SIGNIFICANCE OF EPCAM AND E-CADHERIN IN UROTHELIAL CARCINOMA AND THEIR POSSIBLE ROLE IN TUMOR PROGRESSION",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "STEFAN TSENOV",
                    "LIGHT MICROSCOPIC MORPHOLOGICAL STUDY OF THE RAT KIDNEY DURING THE POSTNATAL PERIOD",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "SYMEON MAVROUDEAS",
                    "PULMONARY EMBOLISM IN 30 YEARS OLD MALE",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "SZABIT AL-TAANI",
                    "THE ROLE OF BUTYRATE IN DENDRITIC CELL-MEDIATED ANTIVIRAL IMMUNE RESPONSE",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "TAISIIA CHERTENKO",
                    "EXPRESSION OF EGFR, VEGF, KI-67 AND GFAP IN PAIRED NEW AND RECURRENT HIGH GRADE DIFFUSE GLIOMAS",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "TAMARA HARUTYUNYAN",
                    "EXPRESSION OF EGFR, VEGF, KI-67 AND GFAP IN PAIRED NEW AND RECURRENT HIGH GRADE DIFFUSE GLIOMAS",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "TUNDE OROSZ",
                    "INVESTIGATION OF ALTERED MICRORNA EXPRESSION INDUCED BY INFLAMMATORY CYTOKINE TREATMENT IN MEGAKARYOCYTES",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "YANTI PARHUSIP",
                    "GYNURABETIC (GYNURA PROCUMBENS AS ANTI-DIABETIC RETINOPATHY): POTENTIAL PHYTOSOME EXTRACT OF SAMBUNG NYAWA LEAF (GYNURA PROCUMBENS) AS AN ANTI-DIABETIC RETINOPATHY VIA INHIBITION OF VEGF EXPRESSION AND NFKB ACTIVATION ON RETINA RATS INDUCED BY STZ",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "BARTOSZ GASIORKIEWICZ",
                    "THE REDUCTION OF INVASIVE POTENTIAL OF HORMONE-DEPENDENT PROSTATE CANCERS CELLS THROUGH INHIBITION OF 3-HYDROXY-3-METHYLGLUTARYL-COENZYME A REDUCTASE (HMG-COAR).",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "ABDURAHMAN MOALIN",
                    "RENIN-ANGIOTENSIN SYSTEM AND ITS ROLE IN DIABETIC NEPHROPATHY.",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "ADELINA PAVLOVA",
                    "SEROLOGICAL AND MOLECULAR DIAGNOSTICS OF COXIELLA BURNETII IN SAMPLES FROM PATIENTS WITH UNCLEAR FEBRILE ILLNESS DURING THE PERIOD 2015 – 2016",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "ALEEZA FATIMA",
                    "IMPLICATIONS OF SEX HORMONES ON TYPE 2 DIABETES IN WOMEN.",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "ANA PIPEROVA",
                    "THE BLEOMYCIN- INDUCED IDIOPATHIC PULMONARY FIBROSIS: A USEFUL INSTRUMENT FOR EXAMINATION THE POSSIBILITIES OF TREATMENT THROUGH NATURAL ANTIOXIDANTS IN MURINE MODELS",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "ANASTASIIA TSISARENKO",
                    "IMMUNOREACTIVITY OF SERA OF PATIENTS WITH PROSTATE CANCER TO HUMAN HSP60",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "ANDREY NIKOLOV",
                    "IN VITRO ANTIOXIDANT EFFECT OF GREEN SYNTHESIZED AGNP'S ON RAT SKIN",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "BARBARA BOROVAC",
                    "EPIDEMIOLOGICAL REWIEV OF TESTICULAR GERM CELL TUMORS IN NORTH COASTAL CROATIAN REGION IN THE PAST DECADE",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "BOYKA ANDONOVALILOVA",
                    "THE BIG CHALLENGE: PRIMARY CULTURES FROM COLORECTAL CANCER",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "CANSU YANIK",
                    "IN VITRO SYNERGYSTIC ACTIVITY OF SEVERAL ANTIBIOTIC COMBINATIONS ON TWO LINEZOLID RESISTANT COAGULASE NEGATIVE STAPHYLOCOCCI ISOLATES",
                    "preclinic"
            );
            session.save();

            session = new Sessions(
                    "DANIEL TRENDAFILOV",
                    "GENDER-RELATED VARIATIONS IN THE EXISTENCE OF GLENOID NOTCH",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "DANIJELA KNEZEVIC",
                    "IN CHILDREN, OBESITY IS PARTICULARLY IMPORTANT, BECAUSE OBESE CHILDREN AS A RULE GROWS INTO A MAN WITH A HIGHER RISK OF DEVELOPING MANY DISEASES AND ONE-THIRD OF OVERWEIGHT CHILDREN IS ADULTS WAS SUCH IN CHILDHOOD. OBJECTIVE: TO DETERMINE THE NUTRITIONAL STATUS OF STUDENTS IN GRADES PRIMARY SCHOOL, THEIR EATING HABITS AND ATTITUDES TOWARDS PERSONAL APPEARANCE.",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "ELENA ANGELESKA",
                    "EFFECT OF LONG TERM APPLICATION OF KETOGENIC DIET IN PILOCARPINE-INDUCED MODEL OF EPILEPSY",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "ELIZE BROKANE",
                    "CLINICAL-MORPHOLOGICAL PROFILE OF HER2 PROTEIN EXPRESSING GASTRIC CANCER",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "ELVIRA DZHALILOVA",
                    "EXPERIMENTAL DIABETES – MORPHOLOGICAL CHARACTERISTICS CARDIOMYOCYTES OF RAT HEART ",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "FENSKA SEIPALLA",
                    "COMPARISON BETWEEN STRONG AND WEEK COUNTRIES UNCERTAINTY AVOIDANCE CULTURE: META-ANALYSIS OF DEATH AND SUICIDE RATE OF THE COUNTRIES",
                    "preclinic"
            );
            session.save();

            session = new Sessions(
                    "GALINA NIKOLOVA",
                    "ASSOCIATION OF FREE RADICAL FORMATION AND RESPIRATORY FUNCTION PARAMETERS IN PATIENTS WITH BRONCHIAL ASTHMA",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "GEORGI BOGDANOV",
                    "EFFECTS OF RISPERIDONE AND PROBIOTIC IN EXPERIMENTAL MODEL OF AUTISM: METABOLIC ISSUES",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "HRISTINA ANGELOVA",
                    "BEHAVIORAL ALTERATIONS INDUCED BY A MODEL OF SPORADIC ALZHEIMER DISEASE: INFLUENCE OF AN INTRACEREBROVENTRICULAR INJECTION OF THE KYOTORPHIN.",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "ILIAS ZAFEIRIDIS",
                    "COMPUTER SIMULATION OF TI-STENTS EFFECTS ON BLOOD VESSEL WALL IN CASES OF ASYMPTOMATIC RESTENOSIS IN CAROTID ARTERIES",
                    "preclinic"
            );
            session.save();

            session = new Sessions(
                    "ISIDORA JANKOVIC",
                    "MORPHOMETRIC ANALYSIS OF HUMAN PITUITARY GLAND ON MRI DURING THE AGING",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "IVA POLITOVA",
                    "IS THERE ANY ASSOCIATION BETWEEN MUSIC AND HEART RATE VARIABILITY",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "IVAN DISKOVSKYI",
                    "THE IMPACT OF OPIOID ON MICROSTRUCTURE FEATURES RAT SKIN",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "KATERYNA VLASOVA",
                    "VACILLATION OF THE MELATONIN RECEPTORS DENSITY IN THE NEURONS OF HYPOTHALAMIC SUPRAOPTIC NUCLEUS UNDER THE CONDITION OF ALTERED PHOTOPERIOD AND INJECTIONS OF MELATONIN",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "KATYA KORCHEVA",
                    "CHANGES IN RAT’S BRAIN ON 2ND AND 5TH MONTH AFTER ALZHEIMER'S DISEASE MODEL",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "LORA DYAKOVA",
                    "EFFECTS OF METAL COMPLEXES OF MELOXICAM, DISULFIRAM, CISPLATIN AND THEIR COMBINATIONS ON VIABILITY AND PROLIFERATION OF HUMAN NON-SMALL CELL LUNG CANCER CELLS",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "LYUBOMIR VELINOV",
                    "NATURAL INHIBITORS OF FIBROBLAST ACTIVATION PROTEIN Α",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "MARIA TRIANTAFYLLIDOU",
                    "NATRIURETIC PEPTIDE SYSTEM - NEW PERSPECTIVES IN THE TREATMENT OF HEART DISEASES ",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "MARIO EMILOV",
                    "THE DEPLETION THEORY OF HUMAN RED BLOOD CELLS AGGREGATION – EXPERIMENTAL STUDY ON THE EFFECT OF NEUTRAL POLYMERS USED IN MEDICINE",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "MARIYA KOZAK",
                    "IMMUNOLOGICAL AND BIOLOGICAL EVALUATION OF NOVEL POLYMER FOR VACCINE DEVELOPMENT",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "MARIYA DRACHUK",
                    "EFFECTS OF MICROWAVE RADIATION ON THE HUMAN BODY",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "MARKO STOJANOVIĆ",
                    "THE EFFECT OF PUTRESCINE ON OXIDATIVE STRESS LEVEL IN RAT LIVER AFTER BILE DUCT LIGATION",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "MARTYNA KOWALCZYK",
                    "OBESITY AND INSULIN RESISTANCE IN GIRLS WITH POLYCYSTIC OVARY SYNDROME",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "MIHAELA GRADINAROVA",
                    "WAVELET ANALYSIS OF ECOG SPECTRUM AT MODEL SYSTEMS OF PARKINSONIAN DISEASES IN RATS",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "NEZI NIZAMOVA",
                    "INVESTIGATING THERMAL DENATURATION PROFILES OF RATBRAIN PROTEOME AND BLOOD SERUM USING DIFFERENTIAL SCANNING CALORIMETRY (DSC)",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "OKSANA SVYSTAK",
                    "ULTRASTRUCTURAL CHANGES OF LUNGS HEMOMICROCIRCULATION IN EXPERIMENTAL DIABETIC RATS AFTER CHRONIC STRESS",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "OLHA MESKALO",
                    "NA, K-ATPASE ACTIVITY IN SPERM CELLS OF INFERTILE MEN",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "PLAMEN MINKOV",
                    "NON-SMALL CELL LUNG CANCER AND EPIDERMAL GROWTH FACTOR RECEPTORS",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "POLINA GORANOVA",
                    "EFFECTS OF CHRONIC TREATMENT WITH AGOMELATINE ON SEIZURE ACTIVITY, COMORBID BEHAVIORAL CHANGES AND NEURONAL DAMAGE IN THE KAINATE MODEL OF TEMPORAL LOBE EPILEPSY",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "RARES ADRIAN COJOCARU",
                    "ETIOLOGICAL, CLINICAL AND HISTOLOGICAL CORRELATIONS IN GASTRIC CANCER",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "RIFA ROAZAH",
                    "HEALTH RELATED QUALITY OF LIFE IN PEER AND NON-PEER GROUP TYPE-2 DIABETES MELLITUS AND ITS ASSOCIATION WITH CRP LEVEL",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "SEVERINA SEMKOVA",
                    "LOADING EFFICIENCY OF THERANOSTIC MULTIMODAL NANOPARTICLES FOR CONVENTIONAL FLUORESCENT DYES AND QUANTUM DOTS",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "STEFANA GROUDEVA",
                    "EFFECTS OF VALPROIC ACID ON FETUSES AND NEWBORN PUPS",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "TANYA ZHIVKOVA",
                    "ZN/AG AND ZN/AU COMPLEXES WITH SCHIFF BASES SIGNIFICANTLY REDUCE 3D GROWTH OF CANCER CELLS IN VITRO",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "TOLGAHAN KONBAL",
                    "NEW TREATMENT OF HEPATITIS-C ",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "UKUEMI EDEMA",
                    "PLASMOCYTOID CARCINOMA OF URINARY BLADDER. A CASE FROM THE PRACTICE OF A PATHOLOGIST",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "ULIANA IERFEMOVA",
                    "LIPID PEROXIDATION IN EJACULATED SPERMATOZOA OF INFERTILE MEN WITH DIFFERENT FORMS OF PATOSPERMIA",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "VESELA LOZANOVA",
                    "ASSESSMENT OF THE CHLOROGENIC ACID PROFILE OF TANACETUM VULGARE L. (TANSY)",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "VLADANA STOJILJKOVIC",
                    "SIGNIFICANCE OF URINARY MARKERS IN THE EVALUATION OF GRAFT INJURY IN RENAL TRANSPLANT PATIENTS",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "VLADYSLAV YOSYPENKO",
                    "NEURONS’ CHANGES OF SUPRACHIASMATIC NUCLEI OF RAT HYPOTHALAMUS UNDER CONDITIONS OF THE CHANGED PHOTOREGIMEN",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "YANA KOVTUN",
                    "ANATOMY OF EYEBALL FIBROUS TUNIC BLOODSTREAM OF WHITE RAT UNDER NORMAL CONDITIONS AND UNDER THE EFFECT OF NALBUPHINE",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "ZHENYA STEFANOVA",
                    "ROLE OF RISPERIDONE AND PROBIOTIC IN ACTIVE AVOIDANCE TEST OF RATS IN EXPERIMENTAL MODEL OF AUTISM",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "ZORYANA FEDOROVYCH\n",
                    "INFLUENCE OF HEAVY METALS IONS ON THE EMBRYO METABOLISM",
                    "preclinic"
            );
            session.save();
            session = new Sessions(
                    "ADRIAN REYNALDO SUDIRMAN",
                    "COMPARATIVE THERAPEUTIC EFFECT OF ACALYPHA INDICA LINN. EXTRACT AND GEMFIBROZIL ON HIGH FRUCTOSE AND CHOLESTEROL DIET INDUCING PANCREAS STEATOSIS IN SPRAGUE-DAWLEY RAT",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "AIDA VEHABOVICDELIC",
                    "VOLUME COMPUTED TOMOGRAPHY PERFUSION (VCTP) IMAGING OF METASTASIZING RCC: COMPARISON BETWEEN CHANGES IN PERFUSION AND CHANGES IN SIZE IN THE EARLY FOLLOW UP AFTER TARGETED THERAPY – PRELIMINARY RESULTS",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "ALEKSANDAR TODOROV",
                    "CANNABINOID USE IN CHRONIC PAIN ",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "ALICJA HOFFMAN",
                    "HEMATOLOGICAL MALIGNANCIES IN JEHOVAH’S WITNESSES – REPORT FROM A SINGLE INSTITUTION",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "ALICJA PIETRASZEK",
                    "CELIAC DISEASE IN PATIENTS WITH DIABETES MELLITUS TYPE 1 – OBSERVATIONS FROM THE SINGLE PEDIATRIC CENTER FROM MIDDLE EUROPE",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "ANI TODOROVA",
                    "DIABETIC FOOT: A CASE REPORT",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "ANNA VINCZE",
                    "THE EFFECT OF KYNURENIC ACID ON CELL DEATH INDUCED BY SIMULATED ISCHEMIA/REOXYGENATION IN CARDIOMYOCYTES",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "ARPAN DOSHI",
                    "A REVIEW OF GENOTYPE-PHENOTYPE PRESENTATIONS IN PATIENTS WITH PSEUDOHYPOALDOSTERONISM TYPE 1 FOLLOWING THE IDENTIFICATION OF NOVEL MUTATIONS",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "ATHANASIA EVANGELINO",
                    "A CLINICAL CASE OF A PATIENT WITH ACQUIRED LONG QT SYNDROME AND POLYMORPHIC VENTRICULAR TACHYCARDIA TYPE TORSADE DE POINTES DUE TO ISCHEMIC HEART DISEASE, HYPOKALEMIA, AMIODARONE AND THE ANTIPSYCHOTIC DRUG RISPERIDONE",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "CHRISTINA SPANIA",
                    "PECULIAR CUSHING SYNDROME CASE",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "CHRISTOS PETKOU",
                    "THE POTENTIAL BENEFICIAL IMMUNOMODULATORY ACTION OF THE ENDOCANNABINOID SYSTEM IN MULTIPLE SCLEROSIS",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "DALIYA PENCHEVA",
                    "WHICH ARE THE MOST COMMON FEATURES OF THE METABOLIC SYNDROME IN DIABETES?",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "DAN ARHIRE",
                    "GIANT HYDRARTHROSIS OF THE KNEE – THE CLINICAL EXPRESSION OF A RARE DISORDER, PACHYDERMOPERIOSTOSIS",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "DUSAN RADOMIROVIC",
                    "MULTI-SLICE COMPUTED TOMOGRAPHY IN DETERMINATION OF LYMPH NODE INVOLVEMENT IN LUNG CANCER",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "TEODOR DRENOWSK",
                    "SERUM ANTI-COLLAGEN TYPE IV IGM ANTIBODIES AND DEVELOPMENT OF MICROVASCULAR COMPLICATIONS IN DIABETICS WITH ESSENTIAL HYPERTENSION",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "EMILIYA DIMITROVA",
                    "POSSIBILITIES IN USE OF NEUROIMAGING TECHNIQUES IN PATIENTS WITH SCHIZOPHRENIA",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "FARNAZ ALIGOLIGHASEMABADI",
                    "EVALUATION OF PROSTAGLANDIN E1 INFUSION ON URINARY CALCIUM EXCRETION IN NEONATE WITH CONGENITAL HEART DISEASE",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "GORAN BOKAN",
                    "THE PREVALENCE OF PERIPHERAL BLOOD CYTOPENIAS IN PATIENTS WITH DECOMPENSATED LIVER CIRRHOSIS OF ALCOHOLIC ETIOLOGY",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "HARMELA SINANAJ",
                    "TYPE 2 DIABETES AND COGNITIVE IMPAIRMENT: THE DOUBLE BURDEN",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "KATSIARYNA LIAONCHYK",
                    "DRUG-INDUCED LIVER INJURY IN PATIENTS WITH GOUT AFTER RECEIVING NSAIDS",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "KRISTINA CHOLAKOVA",
                    "POSSIBLE EARLY DETECTION OF PSEUDOMONAS AERUGENOSA IN CF PATIENTS IN BULGARIA COULD HELP PREVENT A CHRONIC INFECTION ",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "LAURA PILVINYTE",
                    "VARIATION BETWEEN PHYSICIANS IN ADENOMA DETECTION RATE ",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "LILLA HORVATH",
                    "THE EFFECTIVENESS OF REPETITIVE TRANSCRANIAL MAGNETIC STIMULATION FOR TREATMENT RESISTENT DEPRESSION",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "MARGARITA ZHELYAZKOVA",
                    "NEW ACYLPHLOROGLUCINOLS AS PROMISING NATURAL ANTICANCER COMPOUNDS",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "MARTIN STEFANOV",
                    "A CASE REPORT OF A MALE PATIENT WITH RETINAL DETACHMENT\n",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "MINA SERDAROVA",
                    "SUCCESSFUL MANAGEMENT OF INSULIN ALLERGY WITH CONTINUOUS SUBCUTANEOUS INSULIN INFUSION CSII : A CASE STUDY REPORT",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "MINDAUGAS ZIURLYS",
                    "NEW APPROACH TO POSITRON EMISSION TOMOGRAPHY WITH COMPUTED TOMOGRAPHY – MORE DETAILS FOR BETTER QUALITY?",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "MOHAMMAD SADEGHDOUST",
                    "NEPHROCALCINOSIS IN PRETERM NEONATE: STUDY OF INCIDENCE AND RISK FACTORS",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "MYKOLAS VENCKUS",
                    "ACUTE EPIGLOTTITIS IN ADULTHOOD. CLINICAL CASE REPORT",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "NATALIIA MELNYK",
                    "EFFECT OF LIPID DISTURBANCES ON THE EXСRETORY PANCREATIC FUNCTION IN PATIENTS WITH CHRONIC PANCREATITIS CONCOMITANT WITH STABLE CORONARY ARTERY DISEASE",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "NISA ALIYEVA",
                    "THE TREATMENT OF AUTOIMMUNE THYROIDITIS WITH SELENIUM",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "OLENA AL-TRAWNEH",
                    "DYNAMICS OF INDICATORS OF SYSTEMIC INFLAMMATION IN PATIENTS WITH HYPERTENSION AND DIABETES MELLITUS TYPE 2",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "OLENA TITKOVA",
                    "BIOMINERALAL ANALYSIS IN DIAGNOSIS OF UROLITHIASIS DISEASE IN CHILDREN",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "PETYA PETROVA",
                    "CASE REPORT: DRAMATIC RESPONSE TO DABRAFENIB IN PATIENT WITH BRAF (V600) MUTATED METASTATIC MELANOMA",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "SAULENE RACKAUSKAITE",
                    "SUDDEN NON-CORONARY DEATHS IN YOUNG ADULTS. CLINICAL CASES",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "SOFIYA NIKOLOVA",
                    "UNUSUAL CONSTELLATION OF GLOMERULONEPHRITIS WITH NEPHROTIC SYNDROME, THROMBOCYTOPENIA AND ENCEPHALOPATHY IN ICU SETTINGS – A CASE STUDY",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "SONJA JANKOVIC",
                    "MULTI-SLICE COMPUTED TOMOGRAPHY CORONARY ANGIOGRAPHY IN PATIENTS AFTER BYPASS PROCEDURE",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "STEVEN MARKS",
                    "CURRENT EVIDENCE IN COPROPOIESIS AND THE NEW TSC CLASSIFICATION",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "SUPRIYA RAI",
                    "RELATIONSHIP BETWEEN TEMPORAL LOBE EPILEPSY AND SPIRITUAL/RELIGIOUS EXPERIENCES ",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "BLAGOVESTA RADOSLAVOVA",
                    "CONTINOUS RENAL REPLACEMENT THERAPY FOR MASSIVE RHABDOMYOLISIS AFTER EXPOSURE TO COLD – CASE REPORT",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "ULIANA ZAKHARCHUK",
                    "INTERCONNECTION BETWEEN THE SEVERITY OF CP AND ENDOCRINE PANCREATIC INSUFFICIENCY IN PATIENTS WITH CHRONIC PANCREATITIS WITH CONCOMITANT DIABETES MELLITUS",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "VIGNESH KANNAPPAN",
                    "USAGE OF NEUROMUSCULAR ELECTRICSL STIMULATION IN THE TREATMENT OF CEREBRAL PALSY",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "YELIZ YANIKOGLU",
                    "A RARE CASE OF GASTROINTESTINAL STROMAL TUMOR OF COLON",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "YELIZAVETA MAKSIMOVICH",
                    " EARLY COMPLICATIONS AFTER CORONARY BYPASS OPERATION\n",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "ZILAN DEMIR",
                    "APICAL HYPERTHROPIC CARDIOMYOPATHY WITH SIGNIFICANT HYPERTHROPHY OF PAPILLARY MUSCLES IN COMBINATION WITH IDIOPATHIC HYPEREOSINOPHILIC SYNDROME",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "ADRIANA NIKOLOVA ",
                    "SLEEP APNEA IN PRADER-WILLI SYNDROME ",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "AIKATERINI IOANNOU",
                    "LANGERHANS HISTIOCYTOSIS (LH) ",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "ALEXANDRA CHRYSOSPATHI",
                    "MULTIPLE AUTOIMMUNE SYNDROME IN A PATIENT WITH VITILIGO, PALMOPLANTAR PSORIASIS, AUTOIMMUNE THYROIDITIS AND RECENTLY DIAGNOSED DIABETES MELLITUS?",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "ATHANASIOS KARMOGIANNIS",
                    "MARFAN SYNDROME",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "BILIANA MILEVA",
                    "CRIMINAL ABORTION - A CASE REPORT",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "BLAGICA ARSOVSKA",
                    "CASE REPORT - ACUPUNCTURE FOR FACIAL NERVE PALSY",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "BOHDAN TOFAN",
                    "DIAGNOSTIC VALUE OF NONSPECIFIC BRONCHIAL HYPERRESPONSIVENESS IN ADOLESCENTS WITH DIFFERENT SEVERITY SCORES OF BRONCHIAL ASTHMA ATTACKS",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "BORYANA GEORGIEVA",
                    "HARVONI – THE FIRST COMBINED PILL FOR TREATMENT OF CHRONIC HEPATITIS C",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "DIANA NOVAK",
                    "ROLE OF LIPID METABOLISM DISORDERS IN THE DEVELOPMENT OF RENAL DYSFUNCTION IN PATIENTS WITH HYPOTHYROIDISM",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "DIYAN GANEV",
                    "IDIOPATHIC THROMBOCYTOPENIC PURPURA(ITP) – COMPLICATIONS, TREATMENT AND ADVERSE EFFECTS – A CASE STUDY",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "DORA STEPAN",
                    "GASTROINTESTINAL ANGIODYSPLASIA IN A 4-YEAR-OLD CHILD: A CASE REPORT.",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "EMANUELA ZAHARIEVA",
                    "PREVALENCE OF POSITIVE DIABETES ASSOCIATED ANTIBODIES AMONG TYPE 2 DIABETES IN BULGARIAN POPULATION AND RELATED DIFFERENCE IN METABOLIC AND INFLAMMATORY PHENOTYPE",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "FAIDRA MARAZAKI",
                    "NOVEL DRUG PROTOCOL FOR UP TO 9 WEEKS MEDICAL ABORTION. A BULGARIAN SINGLE CENTER CLINICAL STUDY\n",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "GABRIELA CHIREA",
                    "SMOKING HABITS AND ANTI-CCP ANTIBODIES IN PATIENTS WITH RHEUMATOID ARTHRITIS",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "INAYA MAHMOUD",
                    "APPLICATION OF DUODOPA INTESTINAL GEL IMPROVES THE MOTOR AND NON-MOTOR SYMPTOMS AND QUALITY OF LIFE OF ADVANCED PARKINSON’S DISEASE PATIENTS",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "INNA HORBATIUK",
                    "SOME IMMUNOLOGICAL INDICES AS MARKERS OF NON-STREPTOCOCCAL ETHIOLOGY OF TONSILLITIS PHARYNGITISES IN CHILDREN",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "IRYNA SAVKA",
                    "DIABETES IS A STRESS FACTOR FOR TESTICULAR ULTRASTRUCTURE OF BLOOD VESSELS",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "IVANA BABIĆ",
                    "ANALYSIS OF TREATMENT SATISFACTION AMONG PATIENTS WITH TYPE TWO DIABETES",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "JIVKO MIHAJLOV",
                    "ELECTROCONVULSIVE TREATMENT OF PSYCHIATRIC DISORDERS IN THE CLINIC OF PSYCHIATRY, ALEKSANDROVSKA UNIVERSITY HOSPITAL",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "KALIN PAPOCHIEV",
                    "LUNG IN DISTRESS - ASTHMA VS. SCOLIOSIS",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "KALOYAN IVANOV ",
                    "TREATMENT OF PATIENTS WITH ALK-POSITIVE AND ROS1-POSITIVE ADVANCED NON-SMALL CELL LUNG CANCER WITH KINASE ACTIVITY INHIBITOR – XALKORI",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "KATARINA ANDREJIĆ",
                    "STENTS AS THE TREATMENT OF CAROTID ARTERY RESTENOSIS IN PATIENTS AFTER ENDARTERECTOMY",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "KATERYNA SMIIANHORBUNOVA",
                    "DYNAMICS OF SECRETORY IMMUNOGLOBULIN A IN CHILDREN WITH MONO AND MIXED VARIANTS OF ROTAVIRUS INFECTION",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "LIDYA SUHANDOKO",
                    "THE RELATIONSHIP BETWEEN NASAL SEPTUM DEVIATION AND RHINO SINUSITIS",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "LYUDMILA KHLUNOVSKA",
                    "RISK FACTORS IN THE DEVELOPMENT OF THE GASTROINTESTINAL TRACT CONGENITAL MALFORMATIONS",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "MARIIA ILCHENKO",
                    "FEATURES OF BRONCHIAL ASTMA COURSE AND CONTROL IN SCHOOLCHILDREN WITH EXCESS BODY WEIGH",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "MARIIA EZHNED",
                    "THE STUDY OF HYPOGLYCEMIC ACTION OF ROOTS AND RHIZOMES OF DANDELION AND INULA HELENIUM (ELECAMPANE)",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "MARTIN VASILEV",
                    "IN VITRO STUDY OF NEWLY SYNTHESIZED DERIVATIVES OF CAFFEINE-THIOGLYCOLIC ACID – EFFECTS ON CONTRACTILE ACTIVITY OF SMALL BRAIN VESSELS ",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "MASSIMO BEMBIĆ",
                    "ANTIMICROBIAL RESISTANCE OF PATHOGENS ISOLATED FROM BLOOD CULTURES AT THE DEPARTMENT OF HAEMATOLOGY",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "METODI YANEV\n",
                    "A RARE CASE OF INFECTIVE ENDOCARDITIS CAUSED BY STREPTOCOCCUS VESTIBULARIS",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "NINO MAZIASHVILI",
                    "THE CHANGES OF PROTHROMBIN PARAMETERS BY TREATMENT WITH THE WATER EXTRACT OF GREEK WALNUT (JUGLANS REGIA) SEPTUM ON THE EXPERIMENTAL MODEL OF LEUCOPENIA",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "OKOYE DANIEL",
                    "HORMONAL STATUS OF SEROUS TISSUE CANCER OF FALLOPIAN TUBE",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "OLGA TARASAVA",
                    "THE ANALYSIS OF EFFECTIVENESS OF DIFFERENT MEDICAL TECHNOLOGIES IN PATIENTS WITH ACROMEGALY",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "OLGA JAGIASHVILI",
                    "COMORBID CONDITIONS IN CHILDREN BORN WITH USE OF ASSISTED REPRODUCTIVE TECHNOLOGIES",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "OZGE OZDEMIR",
                    "POLYCYSTIC OVARY SYNDROME FOLLOWED BY CARDIOMETABOLIC DISEASES",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "PETAR SHALEV",
                    "THE ROLE OF THE NEW ORAL ANTICOAGULANTS (NOACS) IN ATRIAL FIBRILLATION ",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "PETRANKA CHUMPALOVA",
                    "PSYCHOMOTOR RETARDATION AND IMPAIRED FOCUS ATTENTION IN PATIENTS WITH SCHIZOPHRENIA",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "RUMINA KOLEVA",
                    "THE ROLE OF THE NEW ORAL ANTICOAGULANTS (NOACS) IN ATRIAL FIBRILLATION",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "SANDRA KUDINA",
                    "CORNEAL THICKNESS CORRELATION WITH FUNCTIONAL AND STRUCTURAL GLAUCOMA PARAMETHERS",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "TAMARA MITIC",
                    "THE SIDE EFFECTS OF TAZAROTENE APPLIED LOCALLY IN ACNE THERAPY",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "TEODORA KIRYAKOVA",
                    "ALCOHOL ABUSE AND TRAFFIC ACCIDENT / А CASE REPORT",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "TETIANA MATSEI",
                    "CLINICAL AND DIAGNOSTIC ASPECTS OF DEVELOPING POST-ASPHYXIA SYNDROME IN NEWBORNS",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "TETIANA KORCHYNSKA",
                    "THE CLINICAL FEATURES BRONCHIAL ASTHMA IN CHILDREN DEPENDING ON THE INFLAMMATORY BLOOD PATTERNS",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "VALENTIN VALTCHEV",
                    "TINEA BARBAE ON ATHLETES",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "VALERI MALEV",
                    "CHD IN ADULTS AND CLINICAL CASE",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "VASYA VUTOVA",
                    "CLINICAL AND DEMOGRAPHIC CHARACTERISTICS OF PATIENTS WITH PSYCHIATRIC DISORDERS TREATED IN THE DEPARTMENT OF PSYCHIATRY, ALEXANDROVSKA UNIVERSITY HOSPITAL FOR A 3-YEAR PERIOD ",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "VICTORIA BORISOVA",
                    "CLINICAL CASE OF TYPHOID FEVER",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "VITALII PALCHYKOV",
                    "NEUROTROPIC ACTIVITY OF NEW 1,5-BENZODIAZEPIN-2-ONES",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "ZDRAVKO KAMENOV",
                    "ARE THE RECOMMENDATIONS FOR TREATING DYSLIPIDEMIA IN PATIENTS WITH DIABETES REALLY IMPLEMENTED IN THE CLINICAL PRACTICE?",
                    "therapy"
            );
            session.save();
            session = new Sessions(
                    "AGNESE TIMMERMANE",
                    "FOLLICULAR VARIANT OF PAPILLARY THYROID CARCINOMA: ENCAPSULATED AND NON-ENCAPSULATED SUBTYPES",
                    "surgery"
            );
            session.save();
            session = new Sessions(
                    "ALEKSANDRA GAUDEN",
                    "MANAGEMENT OF PATIENTS WITH CHYLOTHORAX: A SINGLE-CENTRE SEVEN YEAR’S EXPERIENCE",
                    "surgery"
            );
            session.save();

            session = new Sessions(
                    "ALLA GOLOVKO",
                    "CLINICOPATHOLOGICAL DIFFERENCES BETWEEN MINIMALLY INVASIVE AND WIDELY INVASIVE FOLLICULAR THYROID CARCINOMAS",
                    "surgery"
            );
            session.save();


            session = new Sessions(
                    "ANA-MARIA-CRISTINA RADOI",
                    "THE STUDY OF RESECTION MARGINS IN BREAST CONSERVING THERAPY FOR BREAST CANCER",
                    "surgery"
            );
            session.save();

            session = new Sessions(
                    "ANDRII BANADYGA",
                    "PARACLINICAL MARKERS OF ACUTE PANCREATITIS FOR EARLY DIAGNOSIS AND EFFECTIVE SURGICAL TREATMENT\n",
                    "surgery"
            );
            session.save();

            session = new Sessions(
                    "ARTUR KACPRZYK",
                    "LAPAROSCOPIC APPENDECTOMY - IS IT SAFE IN THE HANDS OF A GENERAL SURGERY RESIDENT?",
                    "surgery"
            );
            session.save();

            session = new Sessions(
                    "BARTOSZ MACIĄG",
                    "RESULTS OF MEDIAL PATELLO-FEMORAL LIGAMENT RECONSTRUCTION USING AUTOLOGUS GRACILIS TENDON WITH PATELLAR NO-SCREWS FIXATION",
                    "surgery"
            );
            session.save();

            session = new Sessions(
                    "CHRISTOS TSAGKARIS",
                    "FUNCTIONAL ANATOMY: ASPECTS OF LUNG VASCULATURE CONSTANTINOS VONIATIS NANOFAB",
                    "surgery"
            );
            session.save();

            session = new Sessions(
                    "CONSTANTINOS VONIATIS",
                    "NANOFABRICATED POLY(VINYL ALCOHOL) MESH PROSPECTS IN ABDOMINAL HERNIA TREATMENT",
                    "surgery"
            );
            session.save();

            session = new Sessions(
                    "COSKUN ARKAZ",
                    "AUTOLOGOUS BREAST RECONSTRUCTION WITH THE USE OF INDOCYANINE GREEN FLUORESCENCE ANGIOGRAPHY: A SYSTEMATIC REVIEW",
                    "surgery"
            );
            session.save();

            session = new Sessions(
                    "DEYAN LAZAROV",
                    "URGENT SURGERY FOR COLORECTAL CANCER",
                    "surgery"
            );
            session.save();

            session = new Sessions(
                    "DIMO MANOV\n",
                    "LARGE SPINAL DERMOID CYST WITHOUT OTHER DEVELOPMENTAL ABNORMALITIES AND WITH PRESERVED MOTOR FUNCTIONS - CASE REPORT",
                    "surgery"
            );
            session.save();

            session = new Sessions(
                    "DOROTHY SCORDILIS",
                    "THE IMPORTANCE OF SURGICAL TREATMENT AND CORRECTION OF NON-MELANOMA SKIN CANCERS- MOHS MICROGRAPHIC SURGERY USED WHEN A WIDE EXCISION WOULD LEAVE AN UNFAVORABLE DEFECT.",
                    "surgery"
            );
            session.save();

            session = new Sessions(
                    "FIRAS ALKAFF",
                    "ROLE OF BARIATRIC SURGERY FOR REDUCING GLYCATED HEMOGLOBIN (HBA1C) IN TYPE 2 DIABETES MELLITUS COMPARED TO INSULIN / ORAL ANTIDIABETIC THERAPY",
                    "surgery"
            );
            session.save();

            session = new Sessions(
                    "JAKUB DROS",
                    "INFLUENCE OF A HISTORY OF PREVIOUS ABDOMINAL SURGERY ON THE COURSE AND SHORT-TERM OUTCOMES OF LAPAROSCOPIC BARIATRIC SURGERY\n",
                    "surgery"
            );
            session.save();

            session = new Sessions(
                    "HAMZA HUSSAIN",
                    "PATHOGENESIS BASED SURGICAL TREATMENT OF PILONIDAL DISEASE",
                    "surgery"
            );
            session.save();

            session = new Sessions(
                    "OMER BABIR",
                    "SURGICAL TREATMENT OF SEVERE CASES OF HYDRADENITIS SUPPURATIVA",
                    "surgery"
            );
            session.save();

            session = new Sessions(
                    "ABU TALHA BIN FOKHRUL",
                    "RECONSTRUCTIVE PLASTIC SURGERY IN BANGLADESH",
                    "surgery"
            );
            session.save();

            session = new Sessions(
                    "VESELIN MARINOV",
                    "SOFT TISSUE PLASTIC AFTER DISLOCATION OF HIP JOINT – COMPLICATION AFTER TOTAL HIP ARTHROPLASTY",
                    "surgery"
            );
            session.save();

            session = new Sessions(
                    "JOVANA STEVIC",
                    "GASTRIC ANTRAL VASCULAR ECTASIA HEMORRHAGE IN A PATIENTS WITH AUTOIMMUNE DISEASES",
                    "surgery"
            );
            session.save();

            session = new Sessions(
                    "KAJA TRZECIAK",
                    "WHAT DO FUTURE DOCTORS KNOW ABOUT DIGITAL RECTAL EXAMINATION? – MULTICENTER SURVEY",
                    "surgery"
            );
            session.save();

            session = new Sessions(
                    "KAZYBEK TAKYMAY",
                    "EFFECTIVENESS OF SURGICAL TREATMENTS OF CONGENITAL DISLOCATION IN CHILDREN",
                    "surgery"
            );
            session.save();

            session = new Sessions(
                    "MICHIEL LEMBRECHTS",
                    "PULMONARY VEIN ISOLATION DESPITE AN ANOMALY OF THE INFERIOR VENA CAVA: A CASE REPORT",
                    "surgery"
            );
            session.save();
            session = new Sessions(
                    "MILA KAYRYAKOVA",
                    "CLINICOPATHOLOGICAL FACTORS IN ≤40-YEARS-OLD WOMEN WITH OPERABLE BREAST CANCER: A BREAST UNIT STUDY IN BULGARIA",
                    "surgery"
            );
            session.save();
            session = new Sessions(
                    "NATASA MILCANOVIC",
                    "THE GLASGOW-BLATCHFORD SCORING RISK SYSTEM: PREDICTION OF NEED FOR URGENT ENDOSCOPY IN PATIENTS WITH UPPER GASTROINTESTINAL BLEEDING",
                    "surgery"
            );
            session.save();
            session = new Sessions(
                    "PETAR KRASTEV",
                    "A RARE CASE OF CLIVAL CHORDOMA WITH COINCIDENTAL PITUITARY ADENOMA",
                    "surgery"
            );
            session.save();
            session = new Sessions(
                    "SAMUIL MARINOV",
                    "ZENKER’S DIVERTICULUM: MINIMAL INVASIVE STAPLER ASSISTED APPROACH AND REVIEW OF THE LITERATURE",
                    "surgery"
            );
            session.save();
            session = new Sessions(
                    "SHENAY SADAK",
                    "SURGICAL TREATMENT OF DIABETES MELLITUS TYPE 2",
                    "surgery"
            );
            session.save();
            session = new Sessions(
                    "STANISLAV MORFOV",
                    "GUNSHOT INJURIES OF THE EXTREMITIES BY RIFLE WEAPON AND EXPLOSIVE ACCOUTREMENTS",
                    "surgery"
            );
            session.save();
            session = new Sessions(
                    "TAMAS TOTH",
                    "THE SUCCESS OF TUBULARIZED INCISED PLATE TECHNIQUE IN MIDSHAFT HYPOSPADIAS",
                    "surgery"
            );
            session.save();
            session = new Sessions(
                    "ULADZISLAU YATSUKHNA",
                    "ADVANTAGES OF USING TROMBOELASTOGRAPHY IN OBSTETRIC ICU",
                    "surgery"
            );
            session.save();
            session = new Sessions(
                    "VICTOR KOSTOV",
                    "SEVERE ANTERIOR BRAINSTEM COMPRESSION TREATED BY AN UNORTHODOX POSTERIOR APPROACH – A CASE REPORT",
                    "surgery"
            );
            session.save();
            session = new Sessions(
                    "ZHASSULAN MERGENBAYEV",
                    "CONDITION MICROVASCULATURE THE STOMACH AT LAPAROTOMY",
                    "surgery"
            );
            session.save();
            session = new Sessions(
                    "YORDAN YORDANOV\n",
                    "SURGICAL TREATMENT OF SECONDARY LYMPHEDEMA: CURRENT TRENDS WORLDWIDE AND THE STATE OF ART IN BULGARIA",
                    "surgery"
            );
            session.save();
            session = new Sessions(
                    "VLADA MELNIKOVA",
                    "COULD FOLLICULAR VARIANT OF PAPILLARY THYROID CARCINOMA BE DIAGNOSED BEFORE OPERATION?",
                    "surgery"
            );
            session.save();
            session = new Sessions(
                    "DIANA DEMIJANCHUK",
                    "PROLIFERATIVE ACTIVITY IN COLORECTAL ADENOMAS",
                    "surgery"
            );
            session.save();
            session = new Sessions(
                    "ALEKSANDRA PUSICA ",
                    "THE UTILITY OF GLASGOW-BLATCHFORD SCORE IN MANAGEMENT OF MALLORY WEISS TEAR",
                    "surgery"
            );
            session.save();
            session = new Sessions(
                    "GEORGI IVANOV",
                    "LASERURETEROLITHOTRIPSY – A COMPARISON OF RESULTS AND COMPLICATIONS IN CORRELATION WITH X-RAY EXPOSURE DURING SURGERY",
                    "surgery"
            );
            session.save();
            session = new Sessions(
                    "GABRIELA KIRISHEVA",
                    "CASE REPORT OF MODERN SURGICAL STRATEGY BY MANAGING THE AMYAND`S HERNIA.",
                    "surgery"
            );
            session.save();
            session = new Sessions(
                    "IRENA MIHAYLOVA",
                    "AORTIC DISSECTION – HIDDEN PREDISPOSING FACTORS AND UNUSUAL CONSEQUENCES OF TREATMENT",
                    "surgery"
            );
            session.save();
            session = new Sessions(
                    "IOANA PURICE",
                    "COMBINED APPROACH (ANTERIOR AND POSTERIOR) FOR TYPE II ODONTOID FRACTURE AND C7 BURST FRACTURE-CASE PRESENTATION",
                    "surgery"
            );
            session.save();
            session = new Sessions(
                    "KATARINA BARUKCIC",
                    "VSD POST-MI: AN UNSUAL PRESENTATION (CASE STUDY)",
                    "surgery"
            );
            session.save();
            session = new Sessions(
                    "IRYNA KOZLOVSKA",
                    "THE USE OF INTRA-TISSUE ELECTROPHORESIS IN THE TREATMENT OF DIABETIC FOOT SYNDROME",
                    "surgery"
            );
            session.save();
            session = new Sessions(
                    "KIRIL SURCHEV",
                    "LISFRANC FRACTURE DISLOCATION: CASE REPORT AND LITERATURE DISCUSSION",
                    "surgery"
            );
            session.save();
            session = new Sessions(
                    "RADINA TSEKOVA",
                    "PATIENTS WITH SEVERE SOFT TISSUE INJURY IN MAXILLOFACIAL REGION: MANAGEMENT AND COMPLICATIONS",
                    "surgery"
            );
            session.save();
            session = new Sessions(
                    "SVETOSLAV SLAVCHEV",
                    "MULTIDISCIPLINARY APPROACH IN TREATMENT OF CHRONIC WOUNDS OF THE LOWER LIMBS",
                    "surgery"
            );
            session.save();
            session = new Sessions(
                    "KONI IVANOVA",
                    " A CASE OF HEPATIC VISCERAL LARVA MIGRANS ",
                    "surgery"
            );
            session.save();
            session = new Sessions(
                    "NIKOLA SIMEONOV",
                    "NERVE TRANSFERS IN UPPER LIMB IN CHILDREN-EXCITING ALTERNATIVES FOR THE MANAGEMENT OF PROXIMAL NERVE INJURIES ",
                    "surgery"
            );
            session.save();
            session = new Sessions(
                    "PETRO PROSVITLIUK",
                    "TREATMENT OF RECURRENT INGUINAL HERNIAS THROUGH NYHUS ACCESS",
                    "surgery"
            );
            session.save();
            session = new Sessions(
                    "SERRADJ MOHAMMED AMIN",
                    "A LATE POST-TRAUMATIC RIGHT DIAPHRAGMATIC HERNIA REVEALED BY SUB OCCLUSION ",
                    "surgery"
            );
            session.save();
            session = new Sessions(
                    "TEODOR TSANEV",
                    "RARE CASE OF URETEROCELE ASSOCIATED WITH URETERUS DUPLEX AND THE GENERAL APPROACH FOR DIAGNOSTICS AND TREATMENT",
                    "surgery"
            );
            session.save();
            session = new Sessions(
                    "TSVETOSLAVA TSEKOVA",
                    "GASTROINTESTINAL COMPLICATIONS OF CROHN'S DISEASE, REQUIRING SURGICAL TREATMENT - RESEARCH AND CASE REPORTS",
                    "surgery"
            );
            session.save();
            session = new Sessions(
                    "VLADA MELNIKOVA",
                    "COULD FOLLICULAR VARIANT OF PAPILLARY THYROID CARCINOMA BE DIAGNOSED BEFORE OPERATION?",
                    "surgery"
            );
            session.save();
            session = new Sessions(
                    "VENELIN PETROV",
                    "A STUDY OF THE FABELLA SYNDROME - A RARE CAUSE OF POSTEROLATERAL KNEE PAIN",
                    "surgery"
            );
            session.save();
            session = new Sessions(
                    "YANA FAKIH",
                    "IMPLANT PLACEMENT IN PATIENT WITH EROSIVE LICHEN PLANUS - CASE REPORT",
                    "surgery"
            );
            session.save();
            session = new Sessions(
                    "ALEKSANDRA GRABIEC",
                    "ORAL SURGERY TREATMENT OF PATIENTS WITH RARE GENETIC DISEASES FROM CRANIOSYNOSTOSIS GROUPCLINICAL CASES FROM DEPARTMENT OF ORAL SURGERY, MEDICAL UNIVERSITY OF ŁÓDŹ",
                    "dentistry"
            );
            session.save();
            session = new Sessions(
                    "BUJOR NELU",
                    "ALL CERAMIC CROWNS FOR POSTERIOR TEETH\n",
                    "dentistry"
            );
            session.save();
            session = new Sessions(
                    "DANIEL DAVIDOV",
                    "PROSTHETIC TREATMENT VARIETIES IN EDENTULOUS PATIENTS",
                    "dentistry"
            );
            session.save();
            session = new Sessions(
                    "GABRIELA MOTELICA",
                    "THE PERICORONITIS FREQUENCY OF THE THIRD MOLAR IMPACTION CORRELATING WITH THE PATIENT`S AGE AND GENDER",
                    "dentistry"
            );
            session.save();
            session = new Sessions(
                    "SVETLANA MELNIC",
                    "LOADING OF DENTAL IMPLANTS",
                    "dentistry"
            );
            session.save();
            session = new Sessions(
                    "MIHAIL MOISEI",
                    "THE REASONABLE ANTIBIOTIC THERAPY IN COMBINATION TREATMENT OF PATIENTS WITH LOWER THIRD MOLAR IMPACTION.",
                    "dentistry"
            );
            session.save();
            session = new Sessions(
                    "MERIYAM MOLLOVA",
                    "ARRESTED ERUPTION OF PERMANENT FIRST MOLAR – ETIOLOGICAL FACTORS AND OBSERVATION OF CLINICAL CASE",
                    "dentistry"
            );
            session.save();

            session = new Sessions(
                    "NATALI TSVETANOVA",
                    "TEMPERATURE CHANGES ON THE EXTERNAL ROOT SURFACE DURING POST SPACE PREPARATION (IN VITRO STUDY)",
                    "dentistry"
            );
            session.save();
            session = new Sessions(
                    "MERI HRISTAMYAN",
                    "AWARENESS OF DENTISTS REGARDING COMPLICATIONS OF BISPHOSPHONATE THERAPY IN DENTAL PATIENTS.",
                    "dentistry"
            );
            session.save();
            session = new Sessions(
                    "STELIANA TASHKOVA",
                    "ISOLATION AND CHARACTERIZATION OF STEM CELLS FROM APICAL PAPILLA",
                    "dentistry"
            );
            session.save();
            session = new Sessions(
                    "VELINA STOYKOVA",
                    "PREVALENCE, SIGNIFICANCE AND CONSEQUENCES IN CASES WITH ANTERIOR CROSS BITE MALOCCLUSION",
                    "dentistry"
            );
            session.save();
            session = new Sessions(
                    "BORIS JOVANOVIC",
                    "HARDNESS TESTING ENAMEL AFTER BLEACHING 16% CARBAMIDE PEROXIDE AND RETURN STAINING OF TEETH AFTER THE APPLICATION STAINED DRINKS",
                    "dentistry"
            );
            session.save();
            session = new Sessions(
                    "MARINA MITEVA",
                    "DENTAL PULP CONTAINS STEM CELL POPULATION ",
                    "dentistry"
            );
            session.save();
            session = new Sessions(
                    "SIMION LEVCO",
                    "PARACLINICAL REVIEW IN APPRECIATION OF PUS COLLECTION LOCALIZATION TO THE PATIENTS WITH ORAL FLOOR PHLEGMON",
                    "dentistry"
            );
            session.save();
            session = new Sessions(
                    "VIKTORIA MILEVA",
                    "CLINICAL IMPLICATIONS OF THE ANTERIOR CROSS BITE: INFLUENCES AND RISKS",
                    "dentistry"
            );
            session.save();
            session = new Sessions(
                    "ERICK DUPONT",
                    "FAIL OF A BRAZIL'S PRIMARY HEALTHCARE UNIT VACCINATION COVERAGE REGISTRATION: A DESCRIPTIVE STUDY",
                    "publichealth"
            );
            session.save();
            session = new Sessions(
                    "ERIC TWIZEYIMANA",
                    "KNOWLEDGE LEVEL OF DIABETIC PATIENTS ABOUT IMPLICATIONS OF GLYCEMIA, A CASE FROM RWANDA IN NYANZA HOSPITAL",
                    "publichealth"
            );
            session.save();
            session = new Sessions(
                    "AHMAD HAKIM",
                    "DESCRIPTION OF TUBERCULOSIS INFECTION RISK FACTORS AMONG UNDER FIVE YEARS CHILDREN AT RSUD SIDOARJO, EAST JAVA, INDONESIA DURING JANUARY-JUNE 2014",
                    "publichealth"
            );
            session.save();
            session = new Sessions(
                    "IZABELA PALASZ",
                    "EVALUATION OF THE DEPENDENCY BETWEEN BAD HEALTHY RELATED BEHAVIOR PATTERNS AND FOLLOWING THE PRINCIPLES OF A HEALTHY LIFESTYLE BY TEENAGERS.",
                    "publichealth"
            );
            session.save();
            session = new Sessions(
                    "JAKUB JARCZAK",
                    "ASSESSMENT OF KNOWLEDGE CONCERNING DEALING WITH EYE INJURIES AND FREQUENT OCULAR DISORDERS AMONG STUDENTS OF CRACOW UNIVERSITIES",
                    "publichealth"
            );
            session.save();
            session = new Sessions(
                    "KALINA PEYCHEVA",
                    "ETHICAL DIMENSIONS OF THE PATIENTS’ ATTITUDE TOWARDS THE GP, PROPHYLACTICS AND THE NEW METHODS FOR EARLY DIAGNOSTICS AND TREATMENT ",
                    "publichealth"
            );
            session.save();
            session = new Sessions(
                    "LIANA HAYRAPETYAN",
                    "METABOLIC SYNDROME AND ITS ASSOCIATED EARLY-LIFE FACTORS IN YOUNG ADULTS",
                    "publichealth"
            );
            session.save();
            session = new Sessions(
                    "MOHD SHAMSI",
                    "PROBING THE INTERACTION OF ANTICANCER DRUG TEMSIROLIMUS WITH HUMAN SERUM ALBUMIN: MOLECULAR DOCKING AND SPECTROSCOPIC INSIGHT",
                    "publichealth"
            );
            session.save();
            session = new Sessions(
                    "MUHAMMAD ASIM MASOOM ZUBAIR",
                    "EVALUATION OF BELIEFS AND ATTITUDES TOWARDS ALLOPATHIC MEDICINE AND CAM (COMPLEMENTARY AND ALTERNATIVE MEDICINE) IN ELDERLY POPULATION OF BAHAWALPUR, PAKISTAN",
                    "publichealth"
            );
            session.save();
            session = new Sessions(
                    "NAZIM HUSAIN",
                    "COPPER(II)-INDUCED CYTOTOXICITY AND OXIDATIVE STRESS IN HUMAN BLOOD CELLS AND ITS ATTENUATION BY CARNOSINE",
                    "publichealth"
            );
            session.save();
            session = new Sessions(
                    "PLAMENA TODOROVA",
                    "EPIDEMIOLOGIC STUDY ON DIETARY FACTORS IN UROLITHIASIS",
                    "publichealth"
            );
            session.save();
            session = new Sessions(
                    "ROSITSA NIKOLOVA",
                    "HOW TO LEARN FROM MEDICAL MALPRACTICE AND PREVENT ADVERSE EVENTS ",
                    "publichealth"
            );
            session.save();
            session = new Sessions(
                    "MOHAMED MAHMOOD",
                    "RISK- FACTORS FOR DRUG RESISTANT TUBERCULOSIS IN GEORGIA ",
                    "publichealth"
            );
            session.save();
            session = new Sessions(
                    "VIKTORIA NIKOLOVA",
                    "THE SOCIO-ECONOMIC IMPACT OF URBANIZATION ON THE DEVELOPMENT OF DIABETES MELLITUS TYPE 2",
                    "publichealth"
            );
            session.save();
            session = new Sessions(
                    "TRI KURNIAWAN\n",
                    " RISK FACTOR ANALYSIS OF KIDNEY FAILURE/END-STAGE RENAL DISEASE IN PATIENTS WHO ARE CURRENTLY ON REGULAR HEMODIALYSIS TREATMENT ON DR.WAHIDIN SUDIROHUSODO HOSPITAL MAKASSAR",
                    "publichealth"
            );
            session.save();
            session = new Sessions(
                    "AZKA FOUZI",
                    "DAILY CONSUMPTION OF BOTTLED WATER IN THIRD WORLD COUNTRIES ",
                    "publichealth"
            );
            session.save();
            session = new Sessions(
                    "DESISLAV DINEV",
                    "3D CANCER CELL COLONIES AS SUITABLE MODEL SYSTEMS IN EXPERIMENTAL ONCOPHARMACOLOGY",
                    "publichealth"
            );
            session.save();
            session = new Sessions(
                    "IVELINA TRIFONOVA\n",
                    "VIRAL RESPIRATORY PATHOGENS DETECTED AMONG CHILDREN AGED UNDER FIVE YEARS WITH ACUTE RESPITATORY INFECTIONS DURING THE 2015/2017 AND 2016/2017 WINTER SEASONS IN BULGARIA",
                    "publichealth"
            );
            session.save();
            session = new Sessions(
                    "JURE COLNARIC",
                    "USE OF RED BLOOD CELLS TRANSFUSION IN CHILDREN WITH ACUTE LEUKEMIA",
                    "publichealth"
            );
            session.save();
            session = new Sessions(
                    "KATYA SAVOVA",
                    "LYMPHATICHELLO DRAINAGE USING INDIRECT HIGH FREQUENCY FOR BEAUTY AND HEALTHY FACE",
                    "publichealth"
            );
            session.save();
            session = new Sessions(
                    "KIRIL YANKOV",
                    "COMPLICATIONS FREQUENCY IN NEWLY DIAGNOSED DIABETES TYPE 2",
                    "publichealth"
            );
            session.save();
            session = new Sessions(
                    "MARIANA KUSHKEVYCH",
                    "AGE-RELATED CHANGES OF CELLULAR PRION LOCALIZATION AND LEVEL IN THE RATS’ MUSCLE",
                    "publichealth"
            );
            session.save();
            session = new Sessions(
                    "MARTINA DIETRICH\n",
                    "BREASTFEEDING IN A PRIMARY HEALTH-CARE UNIT OF PELOTAS, BRAZIL: A DESCRIPTIVE EVALUATION OF COVERTURE",
                    "publichealth"
            );
            session.save();
            session = new Sessions(
                    "METODI DONEV",
                    "FACTORS ASSOCIATED WITH CAREER CHOICES AND EXPECTATIONS OF THE STUDENTS AT THE MEDICAL FACULTY IN SKOPJE, MACEDONIA",
                    "publichealth"
            );
            session.save();
            session = new Sessions(
                    "NEVENKA VELICKOVA",
                    "CYTOGENETIC ANALYSIS RELIABLE METHODS FOR DIAGNOSIS ANEUPLOIDIES IN PRENATAL DIAGNOSIS",
                    "publichealth"
            );
            session.save();
            session = new Sessions(
                    "OTARI GOKHADZE",
                    "INFLUENCE OF SOME FOOD ADDITIVE “COCKTAIL EFFECT” ON LABORATORY RATS BEHAVIORS AND INTERNEL ORGANS.",
                    "publichealth"
            );
            session.save();
            session = new Sessions(
                    "SANDEEP SINGH",
                    "LASER INDUCED BREAKDOWN SPECTROSCOPY (LIBS) IN CERVICAL CANCER SCREENING: A PROPOSED TOOL",
                    "publichealth"
            );
            session.save();
            session = new Sessions(
                    "SANJA MILOSEVIC",
                    "USE OF INFORMATION TECHNOLOGY IN SOUTHEASTERN SERBIA",
                    "publichealth"
            );
            session.save();
            session = new Sessions(
                    "SILVIYA VOLEVA",
                    "PARVOVIRUS B19 AS A CAUSATIVE PATHOGENE IN A PATHOLOGICAL PREGNANCY DURING THE 2015-2016 YEAR IN BULGARIA\n",
                    "publichealth"
            );
            session.save();
            session = new Sessions(
                    "TIJANA BRANDMAJER",
                    "THE PREVALENCE OF CONSUMPTION OF ENERGY DRINKS AMONG STUDENTS",
                    "publichealth"
            );
            session.save();
            session = new Sessions(
                    "VALENTINA JUNG",
                    "CHARACTERISTICS OF HOSPITALIZED PATIENTS WITH SEPSIS TREATED ON DEPARTMENT OF HAEMATOLOGY, UNIVESITY HOSPITAL RIJEKA",
                    "publichealth"
            );
            session.save();
            session = new Sessions(
                    "VIRA TOVAZHNIANSKA",
                    "IMPACT OF MOTHERS’ STAPHYLOCOCCOSIS ON ADRENAL GLANDS’ CORTEX OF FETUSES",
                    "publichealth"
            );
            session.save();





        }
    }
}
