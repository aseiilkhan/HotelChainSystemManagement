--
-- PostgreSQL database dump
--

-- Dumped from database version 13.3 (Ubuntu 13.3-1.pgdg20.04+1)
-- Dumped by pg_dump version 14.0 (Ubuntu 14.0-1.pgdg20.04+1)

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

SET default_table_access_method = heap;

--
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
-- Name: hotel_admin; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.hotel_admin (
    login character varying(50) NOT NULL,
    password character varying(50),
    hotel_id integer
);


ALTER TABLE public.hotel_admin OWNER TO postgres;

--
-- Name: hotel_has_number; Type: TABLE; Schema: public; Owner: arsen
--

CREATE TABLE public.hotel_has_number (
    hotel_id integer NOT NULL,
    number character varying(15) NOT NULL
);




ALTER TABLE public.hotel_has_number OWNER TO arsen;

--
-- Name: hotel_has_room_type; Type: TABLE; Schema: public; Owner: arsen
--

CREATE TABLE public.hotel_has_room_type (
    hotel_id integer NOT NULL,
    id integer NOT NULL,
    room_type_id integer NOT NULL
);


ALTER TABLE public.hotel_has_room_type OWNER TO arsen;

--
-- Name: occupied; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.occupied (
    person character varying(40) NOT NULL,
    room_id integer,
    hotel_id integer
);


ALTER TABLE public.occupied OWNER TO postgres;

--
-- Name: reservation; Type: TABLE; Schema: public; Owner: arsen
--

CREATE TABLE public.reservation (
    id integer NOT NULL,
    guest_id integer,
    check_in date,
    ckeck_out date,
    hotel_room_type_id integer
);


ALTER TABLE public.reservation OWNER TO arsen;

--
-- Name: room; Type: TABLE; Schema: public; Owner: arsen
--

CREATE TABLE public.room (
    hotel_room_type_id integer NOT NULL,
    room_number integer NOT NULL,
    floor_number integer
);


ALTER TABLE public.room OWNER TO arsen;

--
-- Name: room_type; Type: TABLE; Schema: public; Owner: arsen
--

CREATE TABLE public.room_type (
    type_name character varying(50) NOT NULL,
    capacity integer,
    size integer,
    id integer NOT NULL
);


ALTER TABLE public.room_type OWNER TO arsen;

--
-- Name: users; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.users (
    login character varying(50),
    password character varying(70),
    guest_id integer
);


ALTER TABLE public.users OWNER TO postgres;

--
-- Data for Name: employee; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.employee (employee_id, name, surname, salary, hotel_id) FROM stdin;
1	a	b	1	1
\.


--
-- Data for Name: guest; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.guest (id, id_type, id_number, address, home_number, mobile_number) FROM stdin;
1	passport	293202390	39009120939021023	\N	\N
2	passport	293202390	3909131	901099213	390091223
\.


--
-- Data for Name: hotel; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.hotel (id, name, address, country) FROM stdin;
1	a	\N	\N
\.


--
-- Data for Name: hotel_admin; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.hotel_admin (login, password, hotel_id) FROM stdin;
\.


--
-- Data for Name: hotel_has_number; Type: TABLE DATA; Schema: public; Owner: arsen
--

COPY public.hotel_has_number (hotel_id, number) FROM stdin;
\.


--
-- Data for Name: hotel_has_room_type; Type: TABLE DATA; Schema: public; Owner: arsen
--

COPY public.hotel_has_room_type (hotel_id, id, room_type_id) FROM stdin;
\.


--
-- Data for Name: occupied; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.occupied (person, room_id, hotel_id) FROM stdin;
\.


--
-- Data for Name: reservation; Type: TABLE DATA; Schema: public; Owner: arsen
--

COPY public.reservation (id, guest_id, check_in, ckeck_out, hotel_room_type_id) FROM stdin;
\.


--
-- Data for Name: room; Type: TABLE DATA; Schema: public; Owner: arsen
--

COPY public.room (hotel_room_type_id, room_number, floor_number) FROM stdin;
\.


--
-- Data for Name: room_type; Type: TABLE DATA; Schema: public; Owner: arsen
--

COPY public.room_type (type_name, capacity, size, id) FROM stdin;
\.


--
-- Data for Name: users; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.users (login, password, guest_id) FROM stdin;
\.


--
-- Name: employee employee_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.employee
    ADD CONSTRAINT employee_pkey PRIMARY KEY (employee_id);


--
-- Name: guest guest_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.guest
    ADD CONSTRAINT guest_pkey PRIMARY KEY (id);


--
-- Name: hotel_admin hotel_admin_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.hotel_admin
    ADD CONSTRAINT hotel_admin_pkey PRIMARY KEY (login);


--
-- Name: hotel_has_number hotel_has_number_pkey; Type: CONSTRAINT; Schema: public; Owner: arsen
--

ALTER TABLE ONLY public.hotel_has_number
    ADD CONSTRAINT hotel_has_number_pkey PRIMARY KEY (hotel_id, number);


--
-- Name: hotel_has_room_type hotel_has_room_type_id_key; Type: CONSTRAINT; Schema: public; Owner: arsen
--

ALTER TABLE ONLY public.hotel_has_room_type
    ADD CONSTRAINT hotel_has_room_type_id_key UNIQUE (id);


--
-- Name: hotel_has_room_type hotel_has_room_type_pkey; Type: CONSTRAINT; Schema: public; Owner: arsen
--

ALTER TABLE ONLY public.hotel_has_room_type
    ADD CONSTRAINT hotel_has_room_type_pkey PRIMARY KEY (hotel_id, room_type_id);


--
-- Name: hotel hotel_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.hotel
    ADD CONSTRAINT hotel_pkey PRIMARY KEY (id);


--
-- Name: room room_pkey; Type: CONSTRAINT; Schema: public; Owner: arsen
--

ALTER TABLE ONLY public.room
    ADD CONSTRAINT room_pkey PRIMARY KEY (hotel_room_type_id, room_number);


--
-- Name: room_type room_type_pkey; Type: CONSTRAINT; Schema: public; Owner: arsen
--

ALTER TABLE ONLY public.room_type
    ADD CONSTRAINT room_type_pkey PRIMARY KEY (id);


--
-- Name: employee employee_hotel_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.employee
    ADD CONSTRAINT employee_hotel_id_fkey FOREIGN KEY (hotel_id) REFERENCES public.hotel(id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: hotel_admin hotel_admin_hotel_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.hotel_admin
    ADD CONSTRAINT hotel_admin_hotel_id_fkey FOREIGN KEY (hotel_id) REFERENCES public.hotel(id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: hotel_has_number hotel_has_number_hotel_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: arsen
--

ALTER TABLE ONLY public.hotel_has_number
    ADD CONSTRAINT hotel_has_number_hotel_id_fkey FOREIGN KEY (hotel_id) REFERENCES public.hotel(id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: hotel_has_room_type hotel_has_room_type_hotel_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: arsen
--

ALTER TABLE ONLY public.hotel_has_room_type
    ADD CONSTRAINT hotel_has_room_type_hotel_id_fkey FOREIGN KEY (hotel_id) REFERENCES public.hotel(id);


--
-- Name: hotel_has_room_type hotel_has_room_type_room_type_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: arsen
--

ALTER TABLE ONLY public.hotel_has_room_type
    ADD CONSTRAINT hotel_has_room_type_room_type_id_fkey FOREIGN KEY (room_type_id) REFERENCES public.room_type(id);


--
-- Name: occupied occupied_hotel_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.occupied
    ADD CONSTRAINT occupied_hotel_id_fkey FOREIGN KEY (hotel_id) REFERENCES public.hotel(id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- Name: reservation reservation_hotel_room_type_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: arsen
--

ALTER TABLE ONLY public.reservation
    ADD CONSTRAINT reservation_hotel_room_type_id_fkey FOREIGN KEY (hotel_room_type_id) REFERENCES public.hotel_has_room_type(id);


--
-- Name: room room_hotel_room_type_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: arsen
--

ALTER TABLE ONLY public.room
    ADD CONSTRAINT room_hotel_room_type_id_fkey FOREIGN KEY (hotel_room_type_id) REFERENCES public.hotel_has_room_type(id);


--
-- Name: users users_guest_id_fkey; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.users
    ADD CONSTRAINT users_guest_id_fkey FOREIGN KEY (guest_id) REFERENCES public.guest(id) ON UPDATE CASCADE ON DELETE CASCADE;


--
-- PostgreSQL database dump complete
--

