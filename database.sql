--
-- PostgreSQL database dump
--

-- Dumped from database version 11.14
-- Dumped by pg_dump version 11.14

-- Started on 2021-12-09 14:41:00

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 196 (class 1259 OID 32771)
-- Name: employee; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.employee (
    employee_id integer NOT NULL,
    name character varying(30),
    surname character varying(40),
    salary integer,
    hotel_id integer
);


ALTER TABLE public.employee OWNER TO postgres;

--
-- TOC entry 197 (class 1259 OID 32774)
-- Name: guest; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.guest (
    id integer NOT NULL,
    id_type character varying(60),
    id_number integer,
    address character varying(100),
    home_number character varying(15),
    mobile_number character varying(15)
);


ALTER TABLE public.guest OWNER TO postgres;

--
-- TOC entry 198 (class 1259 OID 32777)
-- Name: hotel; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.hotel (
    id integer NOT NULL,
    name character varying(30),
    address character varying(100),
    country character varying(50)
);


ALTER TABLE public.hotel OWNER TO postgres;

--
-- TOC entry 199 (class 1259 OID 32780)
-- Name: hotel_admin; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.hotel_admin (
    login character varying(50) NOT NULL,
    password character varying(50),
    hotel_id integer
);


ALTER TABLE public.hotel_admin OWNER TO postgres;

--
-- TOC entry 200 (class 1259 OID 32783)
-- Name: hotel_has_number; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.hotel_has_number (
    hotel_id integer NOT NULL,
    number character varying(15) NOT NULL
);


ALTER TABLE public.hotel_has_number OWNER TO postgres;

--
-- TOC entry 201 (class 1259 OID 32786)
-- Name: hotel_has_room_type; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.hotel_has_room_type (
    hotel_id integer NOT NULL,
    id integer NOT NULL,
    room_type_id integer NOT NULL
);


ALTER TABLE public.hotel_has_room_type OWNER TO postgres;

--
-- TOC entry 202 (class 1259 OID 32789)
-- Name: occupied; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.occupied (
    person character varying(40) NOT NULL,
    room_id integer,
    hotel_id integer
);


ALTER TABLE public.occupied OWNER TO postgres;

--
-- TOC entry 203 (class 1259 OID 32792)
-- Name: reservation; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.reservation (
    id integer NOT NULL,
    guest_id integer,
    check_in date,
    ckeck_out date,
    hotel_room_type_id integer
);


ALTER TABLE public.reservation OWNER TO postgres;

--
-- TOC entry 204 (class 1259 OID 32795)
-- Name: room; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.room (
    hotel_room_type_id integer NOT NULL,
    room_number integer NOT NULL,
    floor_number integer
);


ALTER TABLE public.room OWNER TO postgres;

--
-- TOC entry 205 (class 1259 OID 32798)
-- Name: room_type; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.room_type (
    type_name character varying(50) NOT NULL,
    capacity integer,
    size integer,
    id integer NOT NULL
);


ALTER TABLE public.room_type OWNER TO postgres;

--
-- TOC entry 206 (class 1259 OID 32801)
-- Name: users; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.users (
    login character varying(50),
    password character varying(70),
    guest_id integer
);


ALTER TABLE public.users OWNER TO postgres;

--
-- TOC entry 2871 (class 0 OID 32771)
-- Dependencies: 196
-- Data for Name: employee; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.employee (employee_id, name, surname, salary, hotel_id) FROM stdin;
1	a	b	1	1
11	Ulan	Algabergen	20000	1
22	Sabira	Akzhigitova	200000	1
33	Aruna	Aksaparova	300000	2
44	Aruzhan	Armankyzy	300000	3
55	Arman	Alsabir	3000000	4
66	Ospan	Ali	5000000	5
77	Argymak	Kuanysh	10000000	8
88	Ayan	Kuanysh	10000000	8
99	Aya	Kuatova	20000000	6
\.


--
-- TOC entry 2872 (class 0 OID 32774)
-- Dependencies: 197
-- Data for Name: guest; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.guest (id, id_type, id_number, address, home_number, mobile_number) FROM stdin;
1	passport	293202390	39009120939021023	\N	\N
2	passport	293202390	3909131	901099213	390091223
3	Driving license	1245870	Ulanova39	87089337500	87025942584
4	Driving license	1245871	Ulanova39	87089337501	87025942585
5	National_ID	848509301	Askarova66	87059337501	87015942585
6	National_ID	848509302	Askarova66	87019337501	87055942585
7	National_ID	858509302	Ospanova66	87009337501	87005942585
8	National_ID	808509302	Otarova66	87759337501	872525942585
9	Insurance_ID	122509302	Fifth Avenue 56	007845691	\N
10	Insurance_ID	100509302	Fifth Avenue 56	017845691	\N
\.


--
-- TOC entry 2873 (class 0 OID 32777)
-- Dependencies: 198
-- Data for Name: hotel; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.hotel (id, name, address, country) FROM stdin;
1	a	\N	\N
2	Ramadan	Bauyrzhanov50	Kazakhstan
3	Rixos_Khadisha	Momushuly49	Kazakhstan
4	Petrov	Stalin180	Russia
5	Vladivostok	Lenin180	Ukraine
6	Aishvariya_Rai	Momok180	India
7	Trump	Obama200	USA
8	Ula	Oyro200	Brazil
\.


--
-- TOC entry 2874 (class 0 OID 32780)
-- Dependencies: 199
-- Data for Name: hotel_admin; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.hotel_admin (login, password, hotel_id) FROM stdin;
armanov	12345	6
cherry_blossom	12345Cherry	8
ape_grapes	12345Grapes	8
Ulan	12345Bananas	1
Sabira	12345Beautiful	1
Aruzhan_A	12345Beautiful	3
\.


--
-- TOC entry 2875 (class 0 OID 32783)
-- Dependencies: 200
-- Data for Name: hotel_has_number; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.hotel_has_number (hotel_id, number) FROM stdin;
1	1
1	2
1	3
8	3000
7	1000
6	2000
5	200
1	4000
2	500
3	500
4	299
\.


--
-- TOC entry 2876 (class 0 OID 32786)
-- Dependencies: 201
-- Data for Name: hotel_has_room_type; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.hotel_has_room_type (hotel_id, id, room_type_id) FROM stdin;
1	1	1
1	2	2
1	3	3
1	4	55
8	5	88
7	6	77
6	7	66
2	8	44
3	9	33
3	10	22
3	11	11
\.


--
-- TOC entry 2877 (class 0 OID 32789)
-- Dependencies: 202
-- Data for Name: occupied; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.occupied (person, room_id, hotel_id) FROM stdin;
Prianka	1000	4
Nick	1000	8
Chris	1001	8
Abdughappar	1111	5
Abdulla	1112	5
Aska	112	4
Aka47	113	4
Itachi	115	5
Shin	116	5
\.


--
-- TOC entry 2878 (class 0 OID 32792)
-- Dependencies: 203
-- Data for Name: reservation; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.reservation (id, guest_id, check_in, ckeck_out, hotel_room_type_id) FROM stdin;
10	10	2021-12-21	2021-12-30	5
9	9	2021-12-12	2021-12-30	5
8	8	2021-12-12	2021-12-30	2
7	7	2021-12-12	2021-12-30	3
6	6	2021-12-10	2021-12-18	4
\.


--
-- TOC entry 2879 (class 0 OID 32795)
-- Dependencies: 204
-- Data for Name: room; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.room (hotel_room_type_id, room_number, floor_number) FROM stdin;
1	12	12
1	1222	12
1	1222222	12
2	1222222	12
2	12	12
11	1001	11
11	1002	10
11	1003	10
11	1004	10
11	1005	10
11	1006	10
8	1000	1
8	1010	2
8	1011	2
8	1012	2
8	1013	2
8	1014	2
8	1015	2
7	100	1
7	200	2
7	300	3
1	1	1
1	2	1
1	100	1
1	250	2
\.


--
-- TOC entry 2880 (class 0 OID 32798)
-- Dependencies: 205
-- Data for Name: room_type; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.room_type (type_name, capacity, size, id) FROM stdin;
single	1	1	1
single	1	1	2
single	1	1	3
Iconic	4000	5	11
Luxury	5000	6	22
Luxury	5000	6	33
Ordinary	5000	6	44
VIP	10000	10	55
VIP	10000	10	66
Motel	100	10	77
Motel	100	10	88
Double	10000	10	4
Double	100	2	5
Double	100	2	6
Double	100	2	7
Double	1000	2	8
\.


--
-- TOC entry 2881 (class 0 OID 32801)
-- Dependencies: 206
-- Data for Name: users; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.users (login, password, guest_id) FROM stdin;
Crazy_apple	Fifth Avenue 56	10
Tasty_cherry	Abbudududa123	9
Sweet_boy	Abbudududa123	8
Lil_girl	Abbudududa123	7
Traveller	Abc123	6
Jealous_Nick	Abc123	5
Lovely_Prianka	Abc123	4
GameOfThronesLover	Abc123	3
\.


--
-- TOC entry 2724 (class 2606 OID 32805)
-- Name: employee employee_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.employee
    ADD CONSTRAINT employee_pkey PRIMARY KEY (employee_id);


--
-- TOC entry 2726 (class 2606 OID 32807)
-- Name: guest guest_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.guest
    ADD CONSTRAINT guest_pkey PRIMARY KEY (id);


--
-- TOC entry 2730 (class 2606 OID 32809)
-- Name: hotel_admin hotel_admin_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.hotel_admin
    ADD CONSTRAINT hotel_admin_pkey PRIMARY KEY (login);


--
-- TOC entry 2732 (class 2606 OID 32811)
-- Name: hotel_has_number hotel_has_number_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.hotel_has_number
    ADD CONSTRAINT hotel_has_number_pkey PRIMARY KEY (hotel_id, number);


--
-- TOC entry 2734 (class 2606 OID 32813)
-- Name: hotel_has_room_type hotel_has_room_type_id_key; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.hotel_has_room_type
    ADD CONSTRAINT hotel_has_room_type_id_key UNIQUE (id);


--
-- TOC entry 2736 (class 2606 OID 32815)
-- Name: hotel_has_room_type hotel_has_room_type_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.hotel_has_room_type
    ADD CONSTRAINT hotel_has_room_type_pkey PRIMARY KEY (hotel_id, room_type_id);


--
-- TOC entry 2728 (class 2606 OID 32817)
-- Name: hotel hotel_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.hotel
    ADD CONSTRAINT hotel_pkey PRIMARY KEY (id);


--
-- TOC entry 2738 (class 2606 OID 32819)
-- Name: room room_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.room
    ADD CONSTRAINT room_pkey PRIMARY KEY (hotel_room_type_id, room_number);


--
-- TOC entry 2740 (class 2606 OID 32821)
-- Name: room_type room_type_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.room_type
    ADD CONSTRAINT room_type_pkey PRIMARY KEY (id);


--
-- TOC entry 2741 (class 2606 OID 32822)
-- Name: employee employee_hotel_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.employee
    ADD CONSTRAINT employee_hotel_id_fkey FOREIGN KEY (hotel_id) REFERENCES public.hotel(id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- TOC entry 2742 (class 2606 OID 32827)
-- Name: hotel_admin hotel_admin_hotel_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.hotel_admin
    ADD CONSTRAINT hotel_admin_hotel_id_fkey FOREIGN KEY (hotel_id) REFERENCES public.hotel(id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- TOC entry 2743 (class 2606 OID 32832)
-- Name: hotel_has_number hotel_has_number_hotel_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.hotel_has_number
    ADD CONSTRAINT hotel_has_number_hotel_id_fkey FOREIGN KEY (hotel_id) REFERENCES public.hotel(id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- TOC entry 2744 (class 2606 OID 32837)
-- Name: hotel_has_room_type hotel_has_room_type_hotel_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.hotel_has_room_type
    ADD CONSTRAINT hotel_has_room_type_hotel_id_fkey FOREIGN KEY (hotel_id) REFERENCES public.hotel(id);


--
-- TOC entry 2745 (class 2606 OID 32842)
-- Name: hotel_has_room_type hotel_has_room_type_room_type_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.hotel_has_room_type
    ADD CONSTRAINT hotel_has_room_type_room_type_id_fkey FOREIGN KEY (room_type_id) REFERENCES public.room_type(id);


--
-- TOC entry 2746 (class 2606 OID 32847)
-- Name: occupied occupied_hotel_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.occupied
    ADD CONSTRAINT occupied_hotel_id_fkey FOREIGN KEY (hotel_id) REFERENCES public.hotel(id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- TOC entry 2747 (class 2606 OID 32852)
-- Name: reservation reservation_hotel_room_type_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.reservation
    ADD CONSTRAINT reservation_hotel_room_type_id_fkey FOREIGN KEY (hotel_room_type_id) REFERENCES public.hotel_has_room_type(id);


--
-- TOC entry 2748 (class 2606 OID 32857)
-- Name: room room_hotel_room_type_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.room
    ADD CONSTRAINT room_hotel_room_type_id_fkey FOREIGN KEY (hotel_room_type_id) REFERENCES public.hotel_has_room_type(id);


--
-- TOC entry 2749 (class 2606 OID 32862)
-- Name: users users_guest_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.users
    ADD CONSTRAINT users_guest_id_fkey FOREIGN KEY (guest_id) REFERENCES public.guest(id) ON UPDATE CASCADE ON DELETE CASCADE;


-- Completed on 2021-12-09 14:41:03

--
-- PostgreSQL database dump complete
--

