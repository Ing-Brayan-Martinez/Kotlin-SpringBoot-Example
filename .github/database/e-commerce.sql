CREATE TABLE IF NOT EXISTS public."Brand" (
  "id" serial NOT NULL,
  "create_at" timestamp NOT NULL DEFAULT now(),
  "update_at" timestamp NOT NULL DEFAULT now(),
  "name" varchar NOT NULL,
  "description" varchar NULL
);

CREATE TABLE IF NOT EXISTS public."Category" (
  "id" serial NOT NULL,
  "create_at" timestamp NOT NULL DEFAULT now(),
  "update_at" timestamp NOT NULL DEFAULT now(),
  "name" varchar NOT NULL,
  "description" varchar NULL
);

CREATE TABLE IF NOT EXISTS public."Product" (
  "id" serial NOT NULL,
  "create_at" timestamp NOT NULL DEFAULT now(),
  "update_at" timestamp NOT NULL DEFAULT now(),
  "name" varchar NOT NULL,
  "description" varchar NULL,
  "price" decimal NULL,
  "stock" integer NOT NULL,
  "brand_id" integer NOT NULL,
  "category_id" integer NOT NULL
);

CREATE TABLE IF NOT EXISTS public."Product" (
  "id" serial NOT NULL,
  "create_at" timestamp NOT NULL DEFAULT now(),
  "update_at" timestamp NOT NULL DEFAULT now(),
  "name" varchar NOT NULL,
  "description" varchar NULL,
  "price" decimal NULL,
  "stock" integer NOT NULL,
  "brand_id" integer NOT NULL,
  "category_id" integer NOT NULL
);