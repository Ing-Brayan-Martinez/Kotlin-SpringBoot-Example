CREATE TABLE IF NOT EXISTS public."Product" (
  "id" serial NOT NULL,
  "create_at" timestamp NOT NULL DEFAULT now(),
  "update_at" timestamp NOT NULL DEFAULT now(),
  "name" varchar NOT NULL,
  "description" varchar NULL,
  "price" decimal NULL,
  "stock" integer NOT NULL
);