# Client Build phase
FROM node:slim as build
LABEL Author=Matusek Version=0.0.2
# This is inside of a container
ARG BUILD_DIR=/home/client
RUN echo $BUILD_DIR
RUN mkdir -p $BUILD_DIR
RUN chmod -R 777 $BUILD_DIR
COPY . $BUILD_DIR
WORKDIR $BUILD_DIR
RUN npm install -g @angular/cli
RUN ng build

# CLient Run phase
FROM nginx
ARG BUILD_DIR=/home/client
COPY  --from=build $BUILD_DIR/dist/Client2/.  /usr/share/nginx/html/
EXPOSE 80